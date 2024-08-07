import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import * as boardApi from '../apis/boardApi';

const Write = ({loginInfo}) => {
  const navigate = useNavigate();

  // 글 등록시 가져갈 데이터
  const [insertData, setInsertData] = useState({
    id : loginInfo.id,
    title : '',
    content : ''
  });

  function changeInsertData(e){
    setInsertData({
      ...insertData,
      [e.target.name] : e.target.value
    });
  }

  function regBoard(){
    boardApi.getWrite(insertData)
    .then((res) => {
      alert('글 등록 완료')
      navigate('/')
      
    })
    .catch((error) => {
      alert('글 등록 오류')
      console.log(error)
    })
  }


  return (
    <div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input type="text" name="title" onChange={(e) => {changeInsertData(e)}} />
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td><textarea name="content" onChange={(e) => {changeInsertData(e)}} ></textarea></td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <button type="button" className="btn" onClick={(e) => {regBoard()}}>글등록</button>
      </div>
    </div>
  );
}

export default Write;