import { useParams } from "react-router-dom";

const Detail = (({board_list}) => {
  //url 주소로 넘어오는 데이터 받을때 사용해야함!
  const params = useParams();
  const boardNum = params.boardNum;
  
  let board = null;
  for(const e of board_list){
    if(e.boardNum == boardNum){
      board = e;
    }
  }

  return (
    <>
      <table>
        <tr>
          <td>글 번호</td>
          <td>{board.boardNum}</td>
          <td>작성자</td>
          <td>{board.writer}</td>
          <td>작성일</td>
          <td>{board.creatDate}</td>
        </tr>
        <tr>
          <td>제목</td>
          <td>{board.title}</td>
        </tr>
        <tr>
          <td>내용</td>
          <td>{board.content}</td>
        </tr>
      </table>
    </>
  );
});

export default Detail;