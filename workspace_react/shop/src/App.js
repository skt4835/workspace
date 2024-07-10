import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import axios from 'axios';

function App() {
  //상품 목록 데이터
  //const item_list = data;
  let item_list = [];

  //axios = server와 통신 axios.get = server에서 data 받아옴
  axios.get('/test1')
  //then 
    .then((response) => {
      console.log(response.data);
    });

  axios.get('/test2')
  .then((res) => {
    console.log(res.data);
  })

  let arr = [];
  axios.get('/test3')
  .then((re) => {
    console.log(re.data);
    arr = re.data;
  })
  
  
  axios.get('/test4')
  .then((res) => {
    console.log(res.data);
    item_list = res.data;
    
  });

  return (
    <div className="App">
      <div className='header'>
        Book Shop
      </div>
      <div className='banner'>
        <img src={process.env.PUBLIC_URL + '/header.jpg'} />
      </div>


      <ItemList item_list={item_list} />
      
      

    </div>
  );
}

const Test = ({name, age}) => {
  // console.log(name);
  // console.log(age);
  return (
    <div>
      
    </div>
  );
}

export default App;
