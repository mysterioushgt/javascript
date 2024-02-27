//document.write("hello")
//let data=document.getElementById("a").innerText;  -- jo bhi andr likha hoga bho
//let data=document.getElementById("a").innerHTML; -- jo html k tag use kiye h bho
//let data=document.getElementById("a").getAttribute("style"); --jo style use ki h
//let data=document.getElementById("a").getAttributeNode("style"); --puri style
let data=document.getElementById("a").attributes[0]; //--jo id lgayi h bho
console.log(data)