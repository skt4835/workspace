import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import * as api from './apis';

const RegScore = () => {
  const {stuNum} = useParams();
  const [stu, setStu] = useState({});
  const navigate = useNavigate();

  //업데이트 쿼리 실행 시 빈 값을 채워줄 데이터
  const [updateData, setUpdateData] = useState({
    stuNum : stuNum,
    korScore : 0,
    engScore : 0,
    mathScore : 0
  });

  //정수가 입력될 때 마다 실행되는 함수
  function changeScore(e){
    setUpdateData({
      ...updateData,
      [e.target.name] : e.target.value
    });
  }

  //성적 입력을 하려는 학생의 이름, 국어, 영어, 수학점수를 조회
  useEffect(() => {
    api.getDetail(stuNum)
    .then((res) => {
      setStu(res.data);

      const {korScore, engScore, mathScore} = res.data;

      setUpdateData({
        ...updateData,
        korScore : korScore,
        engScore : engScore,
        mathScore : mathScore
      })
    })
    .catch((error) => {
      alert('오류!');
    });
  }, [])

  function regScore(){
    // axios.put('/update', updateData);
    api.updateScore(updateData)
    .then((res) => {
      alert('점수를 등록했습니다.');
      navigate('/score');
    })
    .catch((error) => {
      console.log(error);
    });
  }

  return (
    <div>
      {stu.stuName} 학생의 성적을 입력합니다. <br/>
      국어 <input type="text" defaultValue={stu.korScore} name="korScore" onChange={(e) => {changeScore(e)}} /> <br />
      영어 <input type="text" defaultValue={stu.engScore} name="engScore" onChange={(e) => {changeScore(e)}} /> <br />
      수학 <input type="text" defaultValue={stu.mathScore} name="mathScore" onChange={(e) => {changeScore(e)}} /> <br />
      <button type="button" onClick={(e) => regScore()}>점수 등록</button>
    </div>
  );
}

export default RegScore;