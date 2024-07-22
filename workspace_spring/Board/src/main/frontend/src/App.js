import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Board from './pages/Board';


function App() {
  return (
    <div className="container">
      <div className='header'>
        <div>
          <span>Login</span>
          <span>Join</span>
        </div>
        <h1>자 유 게 시 판</h1>
      </div>
      <div className='content'>
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={ <Board /> }></Route>
      </Routes>
      </div>
    </div>
  );
}

export default App;
