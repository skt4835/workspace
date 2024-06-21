
//글쓰기 버튼을 클릭하면 실행하는 함수
//버튼 클릭 시 글쓰기 페이지로 이동
function goWrite(){
  location.href = '/writeForm';
}

function goList(){
  location.href = '/list';
}

// 삭제하기 버튼 클릭 시 실행
function goDelete(boardNum){
  //confirm 실행 후 확인을 클릭하면 true 리턴, 취소를 클릭하면 false를 리턴
  const result = confirm('정말 삭제하시겠어요?');
  
  // 확인을 클릭했을 때만 삭제를 위해 java로 이동
  if (result){
    //location.href = '/delete?boardNum=' + boardNum;
    location.href = `/delete?boardNum=${boardNum}`; //``(백틱) 안에는 변수
  }
  location.href = '/list';
}