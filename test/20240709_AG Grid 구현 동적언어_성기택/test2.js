
function setAvgAge(){
  //나이 태그 선택
  const ageTag = document.querySelectorAll('.ageTd')
  console.log(ageTag);

  // 나이 합
  let sum = 0;
  let avg = 0;

  // 나이 합에 숫자로 변환해서 넣음
  ageTag.forEach(function(ages, i){
    sum += Number(ages.textContent)
  });
  avg = sum / ageTag.length;


  const result = document.querySelector('#resultTd');

  result.innerHTML='';

  result.insertAdjacentHTML("beforeend", avg);

  
  

}