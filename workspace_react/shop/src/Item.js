import { useNavigate } from "react-router-dom";
import data from "./data";
import ItemList from "./ItemList";

const Item = ({item}) => {
  
  //navigate 는 함수
  //navigate('이동할 url');
  //navigate(-1); : 한 페이지 뒤로 가기
  //navigate(-2); : 두 페이지 뒤로 가기
  //navigate(1); : 한 페이지 앞으로 가기
  const navigate = useNavigate();



  return (
    <div>
      <img onClick={(e) => {
        navigate(`/detail/${item.itemNum}`);
      }} src={process.env.PUBLIC_URL + item.imgName} />
      <h4>{item.itemName}</h4>
      <p>{item.price}원</p>
    </div>
  );
}

export default Item;