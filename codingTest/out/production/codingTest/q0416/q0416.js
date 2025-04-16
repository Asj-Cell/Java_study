class Square{
    run(num1,num2){
    let result = 1;
     for (let i = 0; i < num2; i++) {
       result *= num1;
     }
     return result;
    }
}
const test = new Square();
let result=test.run(3,4);
console.log(result);