import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { getInsert } from "./apis";

const RegStu = () => {
  const navigate = useNavigate();
  //쿼리 실행을 위해 전달해야 하는 데이터
  const [stuInfo, setStuInfo] = useState({
    stuName : '',
    stuAge : '',
    tel : '',
    address : ''
  });

  function changeStuInfo(e){
    setStuInfo({
      ...stuInfo,
      [e.target.name] : e.target.value
    });
  }

  function regStudent(){
    console.log(stuInfo);

    //이름 입력했는지 확인
    const nameInputTag = document.querySelector('input[name="stuName"]');
    if (nameInputTag.value == ''){
      alert('이름은 필수 입력입니다.');
      nameInputTag.focus();
      return ;
    }

    axios
    .post('/insertStudent', stuInfo)
    .then((res) => {
      alert('학생정보등록 완료');
      navigate('/');
    })
    .catch((error) => {
      alert('오류');
      console.log(error)
    })
  }


  return (
    <div>
      이름 <input name="stuName" onChange={(e) => {changeStuInfo(e)}} /> <br />
      나이 <input name="stuAge" onChange={(e) => {changeStuInfo(e)}} /> <br />
      연락처 <input name="tel" onChange={(e) => {changeStuInfo(e)}} /> <br />
      주소 <input name="address" onChange={(e) => {changeStuInfo(e)}} /> <br />
      <button type="button" onClick={(e) => {regStudent()}}>학생등록</button>
    </div>
  );
}

export default RegStu;