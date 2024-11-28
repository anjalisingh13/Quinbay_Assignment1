// one line solution (solution 1)
const findElement=(arr, func) =>  arr.find(func);


  
  

const findElement2=(arr, func) =>{
for(let i=0;i< arr.length;i++){
    if(func(arr[i]))
      return arr[i];
  }
   return undefined;
}

console.log(findElement([1, 20, 3, 5], num => num % 5 === 0));
