import axios from 'axios';
import './Join.css';
import * as memberApi from '../apis/memberApi'
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';


const Join = () => {
const navigate = useNavigate();

  //버튼 활성화 여부 state 변수
  const [isDisabled, setIsDisabled] = useState(true);

  //회원가입 시 가져가야 하는 데이터를 저장할 변수 State 변수
  const [joinData, setJoinData] = useState({
    id : '',
    pw : '',
    confirmPw : '',
    name : '',
    gender : 'male'
  });

  //input 태그에 값 입력 시 joinData 변경
  function changeJoinData(e){
    // 아이디 input 태그의 값이 변경되면 회원가입 버튼을 비활성화
    if (e.target.name == 'id'){
      setIsDisabled(true);
    }
    setJoinData({
      ...joinData,
      [e.target.name] : e.target.value
    });
  }
    

  // 아이디 중복 확인 함수
  function checkID(){


    // 아이디 값을 가지고 자바로 가서 중복 확인 쿼리 실행
    memberApi.checkID(joinData.id)
    .then((res) => {
      const result = res.data;

      // if (result){
      //   alert('중복된 아이디 입니다.')
      // }
      // else{
      //   alert('사용 가능한 아이디 입니다.')
      // }

      alert(result ? '중복된 아이디 입니다.' : '사용 가능한 아이디 입니다.' );

      // 사용 가능한 id면 버튼 활성화
      if (!result){
        setIsDisabled(false);
      }
    })
    .catch((error) => {
      alert('에러')
      console.log(error)
    })
  }

//회원가입 버튼 클릭 시 실행
  function join(){
    //validation 처리 (유효성 검사)
    if(joinData.pw != joinData.confirmPw){
      alert('비밀번호가 일치 하지 않습니다.');
      return;
    }

    //아이디 4~8 글자
    const idLength = joinData.id.length;
    if(idLength < 4 || idLength > 8){

    }


    //회원가입
    memberApi.join(joinData)
    .then((res) => {
      alert('회원가입을 축하합니다');

      //로그인 페이지로 이동
      navigate('/loginForm')
    })
    .catch((error) => {
      console.log(error)
    })


  }

  return (
    <div className="join-div">
      <p>아이디</p>
      <div className='id-area'>
        <input type="text" className='inp' name='id' onChange={(e) => {changeJoinData(e)}}/>
        <button type="button" className="btn" onClick={(e) => {checkID(e)}}>중복확인</button>
      </div>
      <div>
        <p>비밀번호</p>
        <input type="password" className='inp' name='pw' onChange={(e) => {changeJoinData(e)}}/>
      </div>
      <div>
        <p>비밀번호 확인</p>
        <input type="password" className='inp' name='confirmPw' onChange={(e) => {changeJoinData(e)}}/>
      </div>
      <div>
        <p>이름</p>
        <input type="text" className='inp' name='name' onChange={(e) => {changeJoinData(e)}} />
      </div>
      <div className='gender-div'>
        <div><span>성별</span></div>
        <div>
          <input type="radio" name='gender' value="male" 
          onChange={(e) => {changeJoinData(e)}} 
          checked={joinData.gender == 'male'} />남
          </div>
        <div><input type="radio" name='gender' value="female"
        onChange={(e) => {changeJoinData(e)}}
        checked={joinData.gender == 'female'}/>여
        </div>
      </div>
      
      <div className='btn-div'>
        <button type="button" className="btn" onClick={(e) => {join()}} disabled={isDisabled}>회원가입</button>
      </div>
    </div>
  );
}

export default Join;