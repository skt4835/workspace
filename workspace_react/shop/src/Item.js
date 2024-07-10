
const Item = ({item}) => {
  return (
    <div>
      <img src={process.env.PUBLIC_URL + item.imgName} />
      <h4>{item.itemName}</h4>
      <p>{item.price}원</p>
    </div>
  );
}

export default Item;