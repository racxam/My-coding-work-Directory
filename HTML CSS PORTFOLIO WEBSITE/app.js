const header=document.querySelector("header");
// -----Sticky navbar----
function stickyNavbar(){
    header.classList.toggle("scrolled");
    console.log("hello",true,window.pageYOffset>0);
    console.log(window.pageYOffset>0)
}
stickyNavbar();
window.addEventListener("scroll",stickyNavbar);
