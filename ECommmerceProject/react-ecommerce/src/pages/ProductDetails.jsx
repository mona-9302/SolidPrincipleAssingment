import { useEffect, useState } from "react";
import { useParams, Link } from "react-router-dom";
import "../styles/product-details.css";
import api from "../api";

export default function ProductDetails() {
  const { id } = useParams();
  const [item, setItem]       = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError]     = useState("");

  useEffect(() => {
    (async () => {
      try {
        setLoading(true); setError("");
        const res = await api.get(`/products/${id}`);  // AXIOS
        setItem(res.data || null);
      } catch (e) {
        setError("Failed to load product");
      } finally {
        setLoading(false);
      }
    })();
  }, [id]);

  if (loading) return <div className="container">Loading...</div>;
  if (error)   return <div className="container">{error}</div>;
  if (!item)   return <div className="container">No data.</div>;

  return (
    <div className="container pd-wrap">
      <Link to="/" className="btn" style={{ marginBottom: 12 }}>← Back</Link>

      <div className="pd-card">
        <div className="pd-img">
          <img src={item.image} alt={item.title} />
        </div>

        <div className="pd-info">
          <div className="pd-title">{item.title}</div>
          <div className="pd-cat">{item.category}</div>
          <div>{item.description}</div>
          <div className="pd-price">₹ {Math.round(item.price * 85)}</div>

          <div style={{ display: "flex", gap: 10 }}>
            <button className="btn">Add to Cart</button>
            <button className="btn">Buy Now</button>
          </div>
        </div>
      </div>
    </div>
  );
}
