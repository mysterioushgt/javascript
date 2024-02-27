const addTaskBtn=document.getElementById('addTask')
const taskTextField=document.getElementById('task')
let taskArray=[];
//get data
let objstr=localStorage.getItem('tasks')
//console.log(objstr)
if(objstr != null){
    //console.log(objstr)
    taskArray=JSON.parse(objstr) // to convert string into object
}

console.log(taskArray)
addTaskBtn.onclick = ()=>{
    const task=taskTextField.value;
    taskArray.push({'taskname':task})
    // console.log(taskArray)
    SaveTask(taskArray)

    
}
function SaveTask(taskArray){
    //console.log(taskArray)
    let str=JSON.stringify(taskArray)  // to convert object into string
    //console.log(str)
    localStorage.setItem('tasks',str)
}