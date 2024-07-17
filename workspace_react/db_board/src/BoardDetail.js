import axios from "axios";
import { useEffect, useState } from "react";
import { navigate, useNavigate, useParams } from "react-router-dom";

const BoardDetail = () => {
  const navigate = useNavigate();
  //route 의 url로 전달되는 데이터 받기
  const params = useParams();
  console.log(params);   //      {boardNum: '1'}

  //상세 정보를 저장할 state변수
  const [board, setBoard] = useState({});

  //DB에서 상세 조회한 내용을 화면에 출력
  useEffect(() => {
    axios
    .get(`/boardDetail/${params.boardNum}`)
    .then((res) => {
      console.log(res.data);
      setBoard(res.data);
    })
    .catch((error) => {
      alert('오류발생!');
      console.log(error);
    });
  }, []);

  function deleteBoard(){
      if (window.confirm('삭제할까유?')){
        axios
        .delete(`/deleteBoard/${board.boardNum}`)
        .then((res) => {
          alert('삭제완료')
          navigate('/');
        })
        .catch((error) => {
          alert('삭제 오류');
          console.log(error)
        });
      }
  }
  
  
  return (
    <div>
      <div>글 번호 : {board.boardNum}</div>
      <div>제목 : {board.boardTitle}</div>
      <div>내용 : {board.boardContent}</div>
      <div>작성자 : {board.boardWriter}</div>
      <div>작성일 : {board.createDate}</div>
      <button type="button" onClick={(e) => {navigate(-1)}}>뒤로가기1</button>
      <button type="button" onClick={(e) => {navigate('/')}}>뒤로가기2</button>
      <button type="button" onClick={(e) => {deleteBoard()}}>글삭제</button>

    </div>
  );
}

export default BoardDetail;

