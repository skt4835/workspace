import { useEffect, useState } from "react";
import * as api from './apis';
import axios from "axios";
import { useNavigate } from "react-router-dom";
import { getStuList } from "./apis";

//rafce
const Score = () => {
  const navigate = useNavigate();
  const [stuList, setStuList] = useState([]);

useEffect(() => {
  getStuList()
  .then((res) => {
    setStuList(res.data)
  })
  .catch((error) => {
    console.log(error)
  });
}, []);


  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생이름</td>
            <td>입력</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((stu, i) => {
              return (
                <tr key={i}>
                  <td>{stuList.length - i}</td>
                  <td>{stu.stuName}</td>
                  <td><button type="button" onClick={(e) => navigate(`/regScore/${stu.stuNum}`)}>입력</button></td>
                </tr>
              );
            })
          }
        </tbody>
      </table>
    </div>
  );
}

export default Score;