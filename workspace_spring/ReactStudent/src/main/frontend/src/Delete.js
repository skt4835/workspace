import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const Delete = () => {

  const navigate = useNavigate();
  const [stuList, setStuList] = useState([]);

// 학생 목록 불러오기
useEffect(() => {
  axios
  .get('/getList')
  .then((res) => {
    setStuList(res.data);
    console.log(res.data);
  })
  .catch((error) => {
    console.log(error);
    alert('오류');
  })
}, []);

function deleteStu(stuNum){
  axios
  .delete(`/delete/${stuNum}`)
  .then((res) => {
    alert('삭제 완료');

    stuList.forEach((stu, i) => {
      if(stu.stuNum == stuNum){
        stuList.splice(i,1);
      }
    });

    setStuList([...stuList]);
  })
  .catch((error) => {
    alert('오류');
    console.log(error);
  })
}

  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생이름</td>
            <td>삭제</td>
          </tr>
        </thead>
        <tbody>
          {
            stuList.map((stu, i) => {
              return (
                <tr key={i}>
                  <td>{stuList.length - i}</td>
                  <td>{stu.stuName}</td>
                  <td><button type="button" onClick={(e) => {deleteStu(stu.stuNum)}}>삭제</button></td>
                </tr>
              );
            })
          }
        </tbody>
      </table>
    </div>
  );
};

export default Delete;