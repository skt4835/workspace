import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import StuList from './StuList';
import RegStu from './RegStu';
import Delete from './Delete';
import Score from './Score';
import StuInfo from './StuInfo';

function App() {

  const navigate = useNavigate();

  return (
    <div className="container">
      {/* 헤더 영역 */}
      <div className='head'>
        <ul>
          <li><span onClick={() => {navigate('/')}}>학생정보조회</span></li>
          <li><span onClick={() => {navigate('/regStu')}}>학생등록</span></li>
          <li><span onClick={() => {navigate('/delStu')}}>학생삭제</span></li>
          <li><span onClick={() => {navigate('/score')}}>성적관리</span></li>
        </ul>
      </div>

      {/* 컨텐츠 영역 */}
      <div className='content'>
        <Routes>
          //학생정보조회 페이지
          <Route path='/' element={ <StuList /> }></Route>
  
          //학생상세정보조회 페이지
          <Route path='/info/:id' element={ <StuInfo /> }></Route>
  
          //학생등록 페이지
          <Route path='/regStu' element={ <RegStu /> }></Route>
  
          //학생삭제 페이지
          <Route path='/delStu' element={ <Delete /> }></Route>
  
          //학생성적관리 페이지
          <Route path='/score' element={ <Score /> }></Route>
  
          //학생성적입력 페이지
          <Route path='' element={() => {}}></Route>
        </Routes>
      </div>
    </div>
  );
}

export default App;
