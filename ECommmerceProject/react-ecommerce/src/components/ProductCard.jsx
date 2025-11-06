import { Link } from "react-router-dom";

export default function ProductCard({ product }) {
  return (
    <Link to={`/product/${product.id}`} className="card">
      <img src={product.image} alt={product.title} />
      <div>
        <div className="card-title">{product.title}</div>
        <div className="card-category">{product.category}</div>
        <div className="card-price">₹ {Math.round(product.price * 85)}</div>
      </div>
      <button className="btn">View Details</button>
    </Link>
  );
}
