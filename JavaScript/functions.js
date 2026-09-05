// const { use } = require("react");

// console.log("H");
// console.log("A");
// console.log("R");
// console.log("S");
// console.log("H");

//here it is just the syntax to write the syntesx to write the functions
// function userr(){
//     console.log("Harsh");
// }
// userr();

// function add(num1=10,num2=10){
//     console.log(num1+num2);
// }

// // add(10,20);
// add();

function loginInfo(username){


if(username === undefined){
    return console.log("Please give the username before login");
    
}else{
    return `${username} is logged in`; 
}
 
}

console.log(loginInfo());