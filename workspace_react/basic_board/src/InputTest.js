import { useState } from "react";

const InputTest = () => {
  const [inputData, setInputData] = useState('');
  //1. const inputData = '';
  //2. inputData라는 변수의 값을 변경하는 -> setInputData함수
  // setInputData('java'); InputData 변수의 값을 'java'로 변경
  // setInputData함수로 값이 변경되면 재렌더링(값을다시그림?)함
  // setInputData가 실행이되어 input값이 변경되면 감싸고있는 컴포넌트를 재해석함!
  
  const [stu, setStu] = useState({
    stuName : '',
    age : 0,
    score : 0,
    addr : ''
  });

  function changeStu(e){
    setStu({
      ...stu,
      [e.target.name] : e.target.value
    });
  }
  return (

    <>
      <div>
          <input type='text' onChange={(e) => {
            //inputData = e.target.value;
            setInputData(e.target.value);
            
          }}/>
          <div>
            학생명 : <input type='text' name='stuName' onChange={(e) => {
              changeStu(e);
            }}/> <br />
            나이 : <input type='text' name='age' onChange={(e) => {
              changeStu(e);
            }}/> <br />
            점수 : <input type='text' name='score' onClick={(e) =>{
              changeStu(e);
            }}/> <br />
            주소 : <input type='text' name='addr' onClick={(e) => {
              changeStu(e);
            }}/> <br />
          </div>
        </div>
  
        <div>
          이름 : {stu.stuName} <br />
          나이 : {stu.age} <br />
          점수 : {stu.score} <br />
          주소 : {stu.addr} <br />
        </div>
  
    </>    
  );
}

export default InputTest;