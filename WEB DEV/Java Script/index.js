let namsteBtn = document.querySelector('button');
namsteBtn.addEventListener('click',inputMsg);
function inputMsg(){
  let name=prompt('Enter the name of Student');
  namsteBtn.textContent='Roll no 1'+ name;

}