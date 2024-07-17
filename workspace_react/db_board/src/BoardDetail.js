import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

const BoardDetail = () => {
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

  
  
  return (
    <div>
      <div>글 번호 : {board.boardNum}</div>
      <div>제목 : {board.boardTitle}</div>
      <div>내용 : {board.boardContent}</div>
      <div>작성자 : {board.boardWriter}</div>
      <div>작성일 : {board.createDate}</div>
      <button type="button" onClick={(e) => {}}>글삭제</button>
    </div>
  );
}

export default BoardDetail;

