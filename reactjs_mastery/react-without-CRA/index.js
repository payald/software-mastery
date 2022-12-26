import React from 'react'
//import  { createRoot }  from 'react-dom/client';
import ReactDOM from "react-dom";
import App from './src/App.js'

const container = document.getElementById('root');
//const root = createRoot(container);
//root.render(<App/>);
ReactDOM.render(<App />, container);