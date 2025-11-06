import { Link } from "react-router-dom";
import "../styles/header.css";

export default function Header({ search, setSearch, category, setCategory, categories }) {
  return (
    <header className="header">
      <div className="nav container">
        
        <div className="brand">
          <div className="logo">PC</div>
          <Link to="/" className="brand-name">Product Center</Link>
        </div>

        <nav className="menu">
          <Link to="/">Home</Link>
          <Link to="/">Products</Link>
          <Link to="/">Contact</Link>
        </nav>

        <div className="actions">
          <button className="icon-btn"><span>🛒</span></button>
          <button className="icon-btn"><span>👤</span></button>
        </div>
      </div>

      <div className="search-bar container">
        <input
          className="input"
          type="text"
          placeholder="Search products..."
          value={search}
          onChange={(e) => setSearch(e.target.value)}
        />
        <select
          className="select"
          value={category}
          onChange={(e) => setCategory(e.target.value)}
        >
          <option value="all">All Categories</option>
          {categories.map((c) => (
            <option key={c} value={c}>
              {c.charAt(0).toUpperCase() + c.slice(1)}
            </option>
          ))}
        </select>
      </div>
    </header>
  );
}
