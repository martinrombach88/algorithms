//require the file system
const fs = require("fs");
//path.join: Ensures platform-independent file paths.
const path = require("path");

const filePath = path.join(__dirname, "puzzleinput.txt");

//read file sync is a synchronous version of file system
const input = fs.readFileSync(filePath, "utf8");
//output: an int, the number of houses visited
//that were visited more than once

//if a house is visited more than once, it counts towards the lucky house count. but if the house is visited again, it can't count towards luckyHouses again.
//therefore you don't need to know how many times more than twice a house has been visited.

// empty | coords: 1 (normal) | coords: 2 (lucky)

const sample = ">v>v<^";
//expected output: key value pair collection?

//array1.includes(coords), add to array2.
//if in array2, it's lucky.
//array2.length = result

//houses {
//0,0 = 1 (start)
//0,1 = 1, (>)
//1,1 = 1, (v)
//1,2 = 1, (>)
//2,2 = 1, (v)
//1,2 = 2, (<)
//1,1 = 2, (^)
//}

let x = 0;
let y = 0;
let length = 0;
const normalArray = [];
const luckyArray = [];

const pushHelper = () => {
  //additions are fine but the validation doesn't work.
  //any duplicates should be added to lucky

  if (!normalArray.includes([y, x])) {
    normalArray.push([y, x]);
  } else {
    luckyArray.push([y, x]);
  }
};

const convertInputToCoords = (input) => {
  for (let i = 0; i < input.length; i++) {
    length++;
    if (input[i] === ">") {
      x++;
    }
    if (input[i] === "<") {
      x--;
    }
    if (input[i] === "^") {
      y--;
    }
    if (input[i] === "v") {
      y++;
    }
    console.log(input[i]);
    pushHelper();
  }
};

convertInputToCoords(sample);
console.log(Object.entries(normalArray));
console.log(Object.entries(luckyArray));
//8196 result -> full length of list so logic isn't good.

console.log("result ", luckyArray.length);
