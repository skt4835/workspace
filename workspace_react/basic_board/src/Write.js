import { useState } from "react";
import { useNavigate } from "react-router-dom";

//글쓰기 페이지
const Write = ({board_list, setBoardList}) => {
  const navigate = useNavigate();
  

  const [board, setBoard] = useState({
    boardNum : 0,
    title : '',
    writer : '',
    date : '',
    content : ''
  });

  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    });
  }

  return (
    <div>
      <table>
        <tr>
          <td>글번호</td>
          <td><input type="text" name="boardNum" onChange={(e) => {
            changeBoard(e);
          }} /></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><input type="text" name="title" onChange={(e) => {
            changeBoard(e);
          }} /></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type="text" name="writer" onChange={(e) => {
            changeBoard(e);
          }} /></td>
        </tr>
        <tr>
          <td>작성일</td>
          <td><input type="date" name="date" onChange={(e) => {
            changeBoard(e);
          }} /></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea name="content" onChange={(e) => {
            changeBoard(e);
          }} /></td>
        </tr>
      </table>
      <button type="button" onClick={(e) => {
        setBoardList([...board_list, board]);
        navigate('/');
      }}>글등록</button>

    </div>
  );
}

export default Write;