import { useEffect, useState } from 'react';
import './StuList.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';


const StuList = () => {
const navigate = useNavigate();

//학생 정보 저장할 state 변수
const [getList, setGetList] = useState([])

//학생 정보 목록 페이지
useEffect(() => {
  axios
  .get('/getList')
  .then((res) => {
    console.log(res.data);
    setGetList(res.data);
  })
  .catch((error) => {
    console.log(error);
  })

}, []);


  return (
    <div className='container'>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생이름</td>
            <td>국어점수</td>
            <td>영어점수</td>
            <td>수학점수</td>
            <td>평균</td>
          </tr>
        </thead>
        <tbody>
          {
            getList.map((stu, i) => {
              return (
                <tr key={i}>
                  <td>{stu.stuNum}</td>
                  <td><span onClick={() => {
                    navigate(`/info/${stu.stuNum}`);
                  }}>{stu.stuName}</span></td>
                  <td>{stu.korScore}</td>
                  <td>{stu.engScore}</td>
                  <td>{stu.mathScore}</td>
                  <td>{(stu.korScore+stu.engScore+stu.mathScore)/3}</td>
                </tr>
              );
            })
          }
        </tbody>
      </table>
      <button type='button'></button>
    </div>
  );
}

export default StuList;