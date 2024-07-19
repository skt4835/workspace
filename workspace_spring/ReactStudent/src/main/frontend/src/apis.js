
//서버와 통신하는 기능을 모아놓은 js

import axios from "axios";

//학생 목록 조회 api
export const getStuList = () => {
  const respnse = axios.get('/getList');
  return respnse;
}



//학생 상세 정보 조회
export const getDetail = (stuNum) => {
  const reponse = axios.get(`/detail/${stuNum}`);
  return reponse;
}

//학생 성적 등록
export const updateScore = (data) => {
  const reponse = axios.put('/updateScore', data);
  return reponse;
}


// export let myName = 'kim';
// export let myAge = 30;

// export const myPrint1 = () => {
//   console.log(1);
// }

// export function myPrint2(){
//   console.log(2);
// }