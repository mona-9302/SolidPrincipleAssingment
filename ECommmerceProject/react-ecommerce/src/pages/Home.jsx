import { useEffect, useState } from "react";
import "../styles/home.css";
import api from "../api";
import ProductCard from "../components/ProductCard";

export default function Home({ search, category }) {
  const [products, setProducts] = useState([]);
  const [categories, setCategories] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  // Fetch all products + categories once
  useEffect(() => {
    const fetchData = async () => {
      try {
        setLoading(true);
        const [productRes, categoryRes] = await Promise.all([
          api.get("/products"),
          api.get("/products/categories"),
        ]);
        setProducts(productRes.data);
        setCategories(["all", ...categoryRes.data]);
      } catch (err) {
        setError("Failed to load products");
      } finally {
        setLoading(false);
      }
    };
    fetchData();
  }, []);

  // ✅ Use props (search, category) for filtering
  const filteredProducts = products.filter((p) => {
    const matchSearch = p.title.toLowerCase().includes(search.toLowerCase());
    const matchCategory =
      category === "all" ||
      p.category.toLowerCase() === category.toLowerCase();
    return matchSearch && matchCategory;
  });

  // Group products by category for display
  const grouped = {};
  filteredProducts.forEach((p) => {
    if (!grouped[p.category]) grouped[p.category] = [];
    grouped[p.category].push(p);
  });

  if (loading) return <div className="container info">Loading products...</div>;
  if (error) return <div className="container info">{error}</div>;
  if (filteredProducts.length === 0)
    return <div className="container info">No products found.</div>;

  return (
    <div className="container">
      {Object.keys(grouped).map((cat) => (
        <section className="section" key={cat}>
          <h2>{cat}</h2>
          <div className="cards">
            {grouped[cat].map((p) => (
              <ProductCard key={p.id} product={p} />
            ))}
          </div>
        </section>
      ))}
    </div>
  );
}
