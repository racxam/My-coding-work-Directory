
let prevHtml=document.querySelector('.sub').innerHTML;


idsub.addEventLister('mouseup',function(){
    document.querySelector('.sub').innerHTML=prevHtml;


})

idsub.addEventLister('mouse',function(){
    document.querySelector('.sub').innerHTML=<b>Details Submitted</b>;


})
