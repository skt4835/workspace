import { Link, useNavigate } from 'react-router-dom';
import './Board.css';

//게시글 목록 컴포넌트
const Board = ({board_list}) => {
  //함수! = > navigate();
  const navigate = useNavigate();
  
  return (
    <>
    <table>
      <thead>
        <tr>
          <td>글번호</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
      </thead>
      <tbody>
        {
          board_list.map((board, i) => {
            return (
              <tr key={i}>
                <td>{board.boardNum}</td>
                <td>
                  {/* <Link to={'/detail'}>{board.title}</Link> */}
                  <span onClick={(e) => {navigate(`/detail/${board.boardNum}`)}}>{board.title}</span>
                </td>
                <td>{board.writer}</td>
                <td>{board.creatDate}</td>
              </tr>
            );
          })
        }
      </tbody>
    </table>
    <button type='button' onClick={(e) => {navigate('/writeForm')}}>글쓸거임?</button>
    <button type='button'>뒤로가셈</button>
    </>
  );
};

export default Board;