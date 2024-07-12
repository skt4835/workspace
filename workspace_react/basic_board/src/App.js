import logo from './logo.svg';
import './App.css';
import data from './data';
import Board from './Board';
import { Route, Routes } from 'react-router-dom';
import Detail from './Detail';
import Write from './Write';
import { useState } from 'react';
import InputTest from './InputTest';

function App() {
  //게시글 목록
  //let board_list = data;
  const [boardList, setBoardList] = useState(data);
 
  //input 태그에 입력한 내용을 저장하는 변수
  //구조분해할당 
  

  

  return (
    <div className="App">
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={ <Board board_list={boardList} /> } />

        {/* 게시글 상세 정보 페이지 */}
        <Route path='/detail/:boardNum' element={ <Detail board_list={boardList} />} />

        {/* 글쓰기 페이지 */}
        <Route path='/writeForm' element={ <Write board_list={boardList} setBoardList={setBoardList}/> } />

        {/* input 값 입력받기 연습 */}
        <Route path='/test' element={ <InputTest /> } />
      </Routes>

      

    </div>
  );
}

export default App;
