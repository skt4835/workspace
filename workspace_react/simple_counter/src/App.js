import logo from './logo.svg';
import './App.css';
import Viewer from './Viewer';
import Controller from './Controller';
import { useState } from 'react';

function App() {
  console.log(1);
  let [count, setCount] = useState(0);

  function changeCount(num){
    //console.log(num);
    const result = count + Number(num);
    console.log(result);

    setCount(result);
  }

  return (
    <div className="App">
    <div className='container'>
    <h1>Simple Counter</h1>
      <Viewer count={count} />
      <Controller changeCount={changeCount}/>
    </div>
    </div>
  );
}






export default App;
