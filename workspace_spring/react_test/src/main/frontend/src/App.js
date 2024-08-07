import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div className="container">
      <div>
        <table>
        <colgroup>
          <col width='25%' />
          <col width='25%' />
          <col width='25%' />
          <col width='25%' />
          </colgroup>
          <tr>
            <td>홈</td>
            <td>차량관리</td>
            <td>판매 정보 등록</td>
            <td>판매 목록</td>
          </tr>
        </table>
      </div>

      <Routes>
        {/* 홈 화면 이동 */}
        <Route path='/' element></Route>
        {/* 차량관리 화면 */}
        <Route path='' element></Route>
        {/* 판매 정보 등록 화면 */}
        <Route path='' element></Route>
        {/* 판매 목록 화면 */}
        <Route path='' element></Route>
      </Routes>
    </div>
  );
}

export default App;
