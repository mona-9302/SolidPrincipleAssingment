import "../styles/footer.css";

export default function Footer() {
  return (
    <footer className="footer">
      <div className="container footer-content">

        <div>
          <h3>Ecom Store</h3>
          <p>Best products at best price</p>
        </div>

        <div>
          <h4>Quick Links</h4>
          <ul>
            <li>Home</li>
            <li>Products</li>
            <li>Contact</li>
          </ul>
        </div>

        <div>
          <h4>Contact</h4>
          <p>Email: support@ecom.com</p>
        </div>

      </div>

      <p className="copy">© 2025 Ecom Store. All rights reserved.</p>
    </footer>
  );
}
