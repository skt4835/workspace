const all = document.querySelector('#chk_all');
const subAll = document.querySelectorAll('input');

function checkAllMenu(){
  if(all.checked){
    for(const sub of subAll){
      sub.checked = true;
    }
  }
  else {
    for(const sub of subAll){
      sub.checked = false;
    }
  }

}

function checkAllOption(e){
  const ul = e.nextElementSibling;
  const inputs = ul.querySelectorAll('input')
  if(e.checked){
    for(const x of inputs){
      x.checked = true;
    }
  }
  else{
    for(const x of inputs){
      x.checked = false;
    }
  }
}