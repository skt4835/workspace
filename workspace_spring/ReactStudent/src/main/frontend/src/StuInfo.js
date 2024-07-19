import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { getDetail } from "./apis";

const StuInfo = () => {
  
  const navigate = useNavigate();
  const params = useParams();
  const [detail, setDetail] = useState({});


  useEffect(() => {
    getDetail(params.stuNum)
    .then((res) => {
      console.log(res.data);
      setDetail(res.data); 
    })
    .catch((error)=>{
      alert('상세오류')
      console.log(error)
    })
  }, []);
  
  const avg = (detail.korScore+detail.engScore+detail.mathScore)/3
  return(
    <div>
      {
      <table>
        <tbody>
          <tr>
            <td>이름</td>
            <td>{detail.stuName}</td>
            <td>나이</td>
            <td>{detail.stuAge}</td>
          </tr>
          <tr>
            <td>연락처</td>
            <td>{detail.tel}</td>
            <td>주소</td>
            <td>{detail.address}</td>
          </tr>
          <tr>
            <td>국어점수</td>
            <td>{detail.korScore}</td>
            <td>영어점수</td>
            <td>{detail.engScore}</td>
          </tr>
          <tr>
            <td>수학점수</td>
            <td>{detail.mathScore}</td>
            <td>평균</td>
            <td>{Math.round(avg * 100) / 100}</td>
          </tr>
        </tbody>
      </table>
      }
    </div>
  );
}
export default StuInfo;
