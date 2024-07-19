import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { getStuList } from "./apis";

const Delete = () => {

  const navigate = useNavigate();
  const [stuList, setStuList] = useState([]);

// 학생 목록 불러오기
useEffect(() => {
  getStuList()
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
    //stuList 라는 STATE 변수의 값을 변경한다 -> 재랜더링되면서 알아서 그림 새롭게 그린다.
    //state 변수의 값을 state 변경 함수를 사용해서 변경

    //데이터베이스에서 삭제한 학생정보를 stuList 에서도 삭제


    stuList.forEach((stu, i) => {
      if(stu.stuNum == stuNum){
        stuList.splice(i,1);
      }
    });

    // const result = stuList.filter( (stu) => {
    //  return stu.stuNum != stuNum
    // } );

    //const arr = [1,2,3,4,5,6,7,8]
    //{}안에 실행되는 내용이 하나라면 생략가능 하나 이상은 생략x
    //return이 있을때 생략x , return을 없애고 {}도 없애면 생략o
    // num 은 arr에서 5 이상의 수의 값을 저장(받아)온다.
    //const result1 = arr.filter( (num) => {
      //return num > 5
    //} );

    //const result2 = arr.filter( (num) => {num % 2 == 0} );

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