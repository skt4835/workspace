import axios from "axios";
import { useEffect, useState } from "react";
import { Navigate, useNavigate } from "react-router-dom";
import * as boardApi from '../apis/boardApi';

const Board = ({loginInfo}) => {
  const navigate = useNavigate();
  const [boardList, setBoardList] = useState([]);

  //게시글 목록 조회
  useEffect(() => {
    boardApi.getBoardList()
    .then((res) => {
      setBoardList(res.data);
    })
    .catch((error) => {
      alert('게시글 목록 조회 오류!');
      console.log(error)
    })
  }, []);

  
  return (
    <div className="board-list-container">
      <div className="search-div">
        <select>
          <option>제목</option>
          <option>작성자</option>
        </select>
        <input type="text" />
        <button className="btn">검색</button>
      </div>
      <div className="board-list-div">
        <table>
          <colgroup>
            <col width='10%'/>
            <col width='*'/>
            <col width='20%'/>
            <col width='20%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>제목</td>
              <td>작성자</td>
              <td>작성일</td>
            </tr>
          </thead>
          <tbody>
            {
              boardList.map((board, i) => {
                return (
                  <tr key={i}>
                    <td>{boardList.length - i}</td>
                    <td>
                      <span onClick={(e) => {navigate(`/detail/${board.boardNum}`)}}>{board.title}</span>
                    </td>
                    <td>{board.id}</td>
                    <td>{board.date}</td>
                  </tr>
                );
              })
            }
          </tbody>
        </table>
      </div>
        {
          loginInfo.id != null ? 
          <div className="button-div">
          <button type="button" className="btn" onClick={(e) => {navigate('/write')}}>글쓰기</button>
          </div>
          : 
          null
        }
      </div>
  );
}

export default Board;