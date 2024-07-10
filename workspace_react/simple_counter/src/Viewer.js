function Viewer(props){
  return (
    <div className='fir'>
      <h3>현재 카운터</h3>
      <p>{props.count}</p>
    </div>
  );
}

// 다른파일에도 이 컴포넌트를 사용할수있게 해줌
export default Viewer;