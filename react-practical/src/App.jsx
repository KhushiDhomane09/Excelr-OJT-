// import React, { useState } from "react";
// import "./App.css";

// // =============================
// // Profile Component using Props
// // =============================
// function Profile(props) {
//   return (
//     <div className="box">
//       <h2>Profile Component</h2>

//       <p><b>Name:</b> {props.name}</p>
//       <p><b>Course:</b> {props.course}</p>
//       <p><b>City:</b> {props.city}</p>
//     </div>
//   );
// }

// function App() {

//   // =============================
//   // Counter State
//   // =============================
//   const [count, setCount] = useState(0);

//   // =============================
//   // Toggle State
//   // =============================
//   const [status, setStatus] = useState(false);

//   // =============================
//   // Text Mirror State
//   // =============================
//   const [text, setText] = useState("");

//   // =============================
//   // Dynamic List
//   // =============================
//   const [item, setItem] = useState("");
//   const [list, setList] = useState([]);

//   const addItem = () => {

//     if(item==="") return;

//     setList([...list,item]);

//     setItem("");

//   };

//   return (

//     <div className="container">

//       <h1>React Practical</h1>

//       {/* ========================= */}
//       {/* Section 1 : Profile */}
//       {/* ========================= */}

//       <Profile
//         name="Khushi Dhomane"
//         course="B.Tech AI & DS"
//         city="Nagpur"
//       />

//       {/* ========================= */}
//       {/* Section 2 : Counter */}
//       {/* ========================= */}

//       <div className="box">

//         <h2>Counter</h2>

//         <h3>{count}</h3>

//         <button onClick={()=>setCount(count+1)}>
//           Increment
//         </button>

//         <button onClick={()=>setCount(count-1)}>
//           Decrement
//         </button>

//       </div>

//       {/* ========================= */}
//       {/* Section 3 : Toggle */}
//       {/* ========================= */}

//       <div className="box">

//         <h2>Toggle Example</h2>

//         <button onClick={()=>setStatus(!status)}>

//           {status ? "ON" : "OFF"}

//         </button>

//       </div>

//       {/* ========================= */}
//       {/* Section 4 : Text Mirror */}
//       {/* ========================= */}

//       <div className="box">

//         <h2>Text Mirroring</h2>

//         <input
//           type="text"
//           placeholder="Type Here"
//           value={text}
//           onChange={(e)=>setText(e.target.value)}
//         />

//         <h3>{text}</h3>

//       </div>

//       {/* ========================= */}
//       {/* Section 5 : Dynamic List */}
//       {/* ========================= */}

//       <div className="box">

//         <h2>Dynamic List</h2>

//         <input
//           type="text"
//           placeholder="Enter Item"
//           value={item}
//           onChange={(e)=>setItem(e.target.value)}
//         />

//         <button onClick={addItem}>
//           Add
//         </button>

//         <ul>

//           {
//             list.map((value,index)=>(
//               <li key={index}>{value}</li>
//             ))
//           }

//         </ul>

//       </div>

//     </div>

//   );

// }

// export default App;

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