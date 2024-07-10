function setTable(){
  // 행 입력 값
  const rowInputTag = document.querySelector('#rowInput').value;
  // 열 입력 값
  const colInputTag = document.querySelector('#colInput').value;

  //안내문구 지우기
  const divTag = document.querySelector('.table-div');
  divTag.innerHTML = '';

  //빈 문자열 생성
  str = '';

  //테이블 생성
  str += '<table>'

  //행 입력받은 값 만큼 생성
  for(let i = 0; i < rowInputTag; i++){
    str += '<tr>'
    // 열 입력받은 값 만큼 생성
    for(let j = 0; j < colInputTag; j++){
      str += `<td>${i+1}행 ${j+1}열</td>`
    }
    str += '</tr>'
  }

  str += '</table>'

  divTag.insertAdjacentHTML("beforeend", str);
  
  
}