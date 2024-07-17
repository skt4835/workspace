import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Write = () => {
  const navigate = useNavigate();

  //입력한 내용을 저장하는 state 변수
  const [board, setBoard] = useState({
    boardTitle : '',
    boardContent : '',
    boardWriter : ''
  }); 

  //글 등록 버튼 클릭 시 실행하는 함수
  function insertBoard(){

    //제목이 비었으면 Ver.자바스크립트 - 속성 선택자
    const title_input = document.querySelector('input[name="boardTitle"]');
    if (title_input.value == ''){
      alert('제목은 필수입력입니다.');
      title_input.focus(); //제목에 커서자동으로 
      return ; //if문 결과값이 true일 때 함수 실행 종료시킴 
    }

    if (document.querySelector('input[name="boardWriter"]').value == ''){
      alert('작성자는 필수입력입니다.');
      title_input.focus();
      return ;
    }
    // document.querySelector('input[type="text"]');

    axios
    .post('/regBoard', board)
    .then((res) => {
      alert('게시글이 등록되었습니다.');
      navigate('/')
    })
    .catch((error) => {
      alert('글 등록 오류!')
      console.log(error);
    });
  }

  //입력 값 세팅
  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    });
      
  }

  return (
    <div>
      제목 : <input name="boardTitle" onChange={(e) => {changeBoard(e)}} /><br />
      작성자 : <input name="boardWriter" onChange={(e) => {changeBoard(e)}} /> <br />
      내용 : <input name="boardContent" onChange={(e) => {changeBoard(e)}} /> <br />
      <button type="button" onClick={(e) => {insertBoard()}}>등록</button>
    </div>
  );
}

export default Write;