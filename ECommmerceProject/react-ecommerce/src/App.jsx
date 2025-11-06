import { Routes, Route } from "react-router-dom"; 
import { useEffect, useMemo, useState } from "react";
import Header from "./components/Header";
import Home from "./pages/Home";
import ProductDetails from "./pages/ProductDetails";
import api from "./api";



async function safeGet(url) {
  try {
    const res = await api.get(url);
    return { data: res.data, error: null };
  } catch (err) {
    console.error(err);
    return { data: null, error: err };
  }
}

export default function App() {
  const [search, setSearch] = useState("");
  const [category, setCategory] = useState("all");
  const [categories, setCategories] = useState([]);

  // 1-time: categories fetch (Axios)
  useEffect(() => {
    (async () => {
      const { data } = await safeGet("/products/categories");
      if (Array.isArray(data)) setCategories(data);
    })();
  }, []);

  const headerProps = useMemo(
    () => ({ search, setSearch, category, setCategory, categories }),
    [search, category, categories]
  );

  return (
    <>
      <Header {...headerProps} />
      <Routes>
        <Route path="/" element={<Home search={search} category={category} />} />
        <Route path="/product/:id" element={<ProductDetails />} />
      </Routes>
    </>
  );
}
