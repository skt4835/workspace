import logo from './logo.svg';
import './App.css';

function App() {
  return (
    // jsx , html 아님
    <div className="App">
      <Mytable>

      </Mytable>
    </div>
  );
}

//컴포넌트
function Mytable(){
  return (
    <table border="1">
      <tr>
        <td>name</td>
        <td>age</td>
      </tr>
    </table>

  );
}

export default App;
