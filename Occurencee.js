let numbers = [1, 2, 2, 1, 3];
let result = {};

for (let count = 0; count < numbers.length; count++) {
    let num = numbers[count];
    if(result[num]) result[num]++;
    else result[num] = 1;
}
console.log(result);
