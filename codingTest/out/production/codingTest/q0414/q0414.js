//let strToDay = new Date();
//console.log(`오늘 날짜는 ${strToDay} 입니다`);
//console.log(`오늘 년도는 ${strToDay.getFullYear()} 입니다`);
//console.log(`오늘 월는 ${strToDay.getMonth()+1} 입니다`);
//console.log(`오늘 일는 ${strToDay.getDate()} 입니다`);
//console.log(`지금 시간는 ${strToDay.getHours()} 입니다`);
//console.log(`지금 분는 ${strToDay.getMinutes()} 입니다`);
//console.log(`지금 초는 ${strToDay.getSeconds()} 입니다`);
//
//strToDay.setDate(strToDay.getDate()+50);
//strToDay.setMinutes(strToDay.getMinutes()+50);
//console.log(`50일을 더한 날짜는 ${strToDay} 입니다.`);
//console.log(`60분을 더한 날짜는 ${strToDay} 입니다.`);
//
//
//console.log(Math.round(10.17));
//console.log(Math.ceil(10.17));
//console.log(Math.floor(10.17));
//console.log(Math.trunc(10.17));
//
//console.log(`Math.random() = ${Math.random()}`);

let numList = [];
//let size=1;

for(let i=0; i<6; i++){
    numList[i] = Math.floor(Math.random()*45)+1;
}
numList.sort(function(a, b){return a-b});
console.log(numList)

//numList = (Math.random() * 45) + 1;
//if (isEquals(number)) {
//numList=number;
//size++;
//}
//function isEquals(number) {
//for (let i = 0; i < numList.length; i++) {
//if (number === numList[i]) {
// return false;
// }
//  }
// return true;
// }