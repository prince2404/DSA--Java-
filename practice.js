// const result = function reverse(str){
//     let reverse = "";
//     for(let i = str.length-1; i >=0; i--){
//         reverse += str[i];

//     }
//     // return reverse;
//     const isPalindrome = str === reverse ? true : false;
//     return isPalindrome;

// }

// console.log(result("hello"));

// const months = ["Jan", "march", "April", "June", "July"];
// months.splice(months.length, 0, "Dec");
// console.log(months);

// const index = months.indexOf("march");
// months.splice(index, 1, "March");
// console.log(months);

// const index = months.indexOf("June");
// months.splice(index,1);
// console.log(months);

// const numbers = [1,2,3,4,6,5,6,7,8,9];
// let value = 6;
// const result = numbers.filter(num => num !== value);
// const result = numbers.filter((num) => {
//     return num !== value;

// });
// console.log(result);

// const products = [
//     {name:"Laptop",price:1200},
//     {name:"Phone",price:800},
//     {name:"Tablet",price:300},
//     {name:"Smartwatch",price:150}
// ];

// const result = products.filter(product => product.price <= 500);
// const result = products.filter((product) => {
//     return product.price <= 500;
// })
// console.log(result);

// const numbers = [1,2,2,3,4,4,5];
// const result = numbers.filter((value,index,array) => {
//     return array.indexOf(value) === index;
// });

// const result = [...new Set(numbers)];
// console.log(result);




// function capitalize(words){
//     return words.map(word => word.toUpperCase());
// }

// const words = ["apple","banana","cherry","date"];
// const result = capitalize(words);
// console.log(result);

// function squareEven(numbers){
//     return numbers.map(num => {
//         if(num % 2 === 0){
//             return Math.pow(num,2);
//         }else{
//             return num;
//         }
//     });
// }

// const numbers = [1,2,3,4,5,6,7,8];
// const result = squareEven(numbers);
// console.log(result);


// function prefixed(names){
//     return names.map(name => {
//         return `Mr. ${name}`;
//     });
// }

// const names = ["Prince", "Deepak", "Rohan","Roy","Nitin"];
// const result = prefixed(names);
// console.log(result);

// let str = "Hello JavaScript, welcome to our world best JavaScript course";
// console.log(str.search(/javaScript/i));
// console.log(str.match(/javascript/gi));
// console.log(...str.matchAll("JavaScript"));
// let result = str.matchAll("JavaScript");
// console.log(result);
// console.log(...result);

// console.log(str.includes("Java"));
// console.log(str.includes(/java/i));
// console.log(str.slice(-6));
// console.log(str.substring(-6));

// console.log(str.replaceAll("o", "z"));

// function printAlphabets(){
//     for(let i = 97; i <= 122; i++){
//         process.stdout.write(String.fromCharCode(i) + " ");
//     }
// }

// printAlphabets();

// function countVowels(str){
//     const vowels = "aeiouAEIOU";
//     let count = 0;

//     for(let i of str){
//         if(vowels.includes(i)){
//             count++;
//         }
//     }
//     return count;
// }

// console.log(countVowels("Hello world, coodiiing"));

// function checkVowels(str){
//     const vowels = ['a', 'e', 'i', 'o', 'u'];
//     str = str.toLowerCase();

//     let result = vowels.every(vowel => str.includes(vowel));
//     return result;
// }

// console.log(checkVowels("Education is powerful"));
// console.log(checkVowels("Hello"));

function containsAllAlphabets(str){
    const alphabets = "abcdefghijklmnopqrstuvwxyz";
    str = str.toLowerCase();

    let result = [...alphabets].every(char => str.includes(char));
    return result;
}

console.log(containsAllAlphabets("The quick brown fox jumps over the lazy dog"));