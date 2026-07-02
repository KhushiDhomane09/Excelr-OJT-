import React from "react";
import "./App.css";

function App() {

  // Dynamic Product List
  const products = [
    {
      id: 1,
      name: "Laptop",
      price: 50000
    },
    {
      id: 2,
      name: "Mobile",
      price: 20000
    },
    {
      id: 3,
      name: "Headphones",
      price: 3000
    },
    {
      id: 4,
      name: "Smart Watch",
      price: 5000
    },
    {
      id: 5,
      name: "Keyboard",
      price: 1500
    },
    {
      id: 6,
      name: "Mouse",
      price: 800
    }
  ];

  return (

    <div className="container">

      <h1>E-Commerce Product List</h1>

      {/* Product Cards */}
      <div className="grid">

        {
          products.map((product) => (

            <div className="card" key={product.id}>

              <h2>{product.name}</h2>

              <p>Price : ₹ {product.price}</p>

              <button>Add to Cart</button>

            </div>

          ))
        }

      </div>

    </div>

  );

}

export default App;