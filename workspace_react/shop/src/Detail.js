import { useParams } from 'react-router-dom';
import './Detail.css';
import { useEffect, useState } from 'react';

const Detail = ({item_list}) => {
  //url로 전달되는 데이터 받기
  //1번 
  // const params = useParams();
  // console.log(params);
  // console.log(params.id);

  //2번
  const {id} = useParams();
  

  let findItem = null;

  item_list.forEach((item, i) => {
    if (item.itemNum == id){
      findItem = item;
    }
  });

  const [num, setNum] = useState(0);
  const [num1, setNum1] = useState(0);

//해당 컴포넌트가 렌더링되면 마지막에 실행
// mount(컴포넌트를 새로 읽을 때) + update(재랜더링) 될때 실행
// useEffect의 두번째 매개변수가 없으면 mount + update 될때 실행
  useEffect(() => {
    console.log(1);
  });

  //mount(컴포넌트를 새로 읽을 때) 될 때 실행
  //두 번째 매개변수로 빈 배열을 전달하면 mount 될 때 실행
  useEffect(() => {
    console.log(2);
  }, []);

  //두 번째 매개변수에 배열형태로 state변수를 넣으면
  //해당 useEffect는 mount + 배열에 넣은 state값이 변경되어 재랜더링 될 때 실행
  useEffect(() => {
    console.log(3);
  }, [num]);


  useEffect(() => {
    console.log(4);
  }, [num, num1]);


  useEffect(() => {
    console.log(5);
  //return 안의 내용은 mount 될 때 실행 x
  //update 될 때 실행되는데 가장 먼저 실행함.
  //unmount 될 때도 실행.
    return () => {
      console.log(6);
    }
  }, [num]);

  //unmount 될 때만 7 출력
  useEffect(() => {
    return () => {
      console.log(7);
    }
  }, [])
// 컴포넌트의 라이프싸이클(생애주기) 사이에 필요한 기능 추가.
// mount : 최초에 컴포넌트가 생성된 시점
// update : 컴포넌트가 재랜더링 되는 상태
// unmount : 컴포넌트가 사라질때


  return (
    <>
    <button type='button' onClick={(e) => {
      setNum(num + 1);
    }}>num값 변경</button>
    <div>num = {num}</div>

    <button type='button' onClick={(e) => {
      setNum1(num1 + 1);
    }}>num1값 변경</button>
    <div>num1 = {num1}</div>



      <div className="item-info">
        <img src={process.env.PUBLIC_URL + '/' + findItem.imgName} />
        <div>
          <h4>{findItem.itemName}</h4>
          <p>{findItem.price}</p>
          <button type='button'>주문하기</button>
        </div>
      </div>
      <div className='intro'>
        <p>{findItem.intro}</p>
      </div>
    </>
  );
}

export default Detail;