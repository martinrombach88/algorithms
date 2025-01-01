//require the file system
const fs = require("fs");
//path.join: Ensures platform-independent file paths.
const path = require("path");

const filePath = path.join(__dirname, "puzzleinput.txt");

//read file sync is a synchronous version of file system
const input = fs.readFileSync(filePath, "utf8");
//console.log(input);

//what data structure do you want?

//output: an int, the number of houses visited
//that were visited more than once

//e.g. santa starts at 0,0. 0,0 is flagged
//visited, or given a 1.
//if the arrows lead to 0,0 again,
//this count goes up to 2.
//the overall 'one visited+' count goes up by one.

//if a house is visited more than once, it counts towards the lucky house count. but if the house is visited again, it can't count towards luckyHouses again.
//therefore you don't need to know how many times more than twice a house has been visited.

//Object.entries? do you want an object or an array?
//key = coords
//value = 0 none | 1 normal | 2 lucky

//how to set the key?
//concat numbers is fine

let luckyHouses = 0;
let length = 0;
const houses = {
  "00": 1,
};

for (let i = 0; i < input.length; i++) {
  length++;
  let house = "00";
  let x = house[0];
  let y = house[1];

  if (input[i] === ">") {
    x = parseInt(x);
    x++;
    house[1] = x.toString();
  }
  if (input[i] === "<") {
    x = parseInt(x);
    x--;
    house[1] = x.toString();
  }
  if (input[i] === "^") {
    y = parseInt(y);
    y--;
    house[0] = y.toString();
  }
  if (input[i] === "v") {
    y = parseInt(y);
    y++;
    house[0] = y.toString();
  }

  //before making assignments ->
  // check the object looks right


  

  /*
  if (houses.hasOwnProperty(house) && houses[house] == 1) {
    houses.house++;
    luckyHouses++;s
  } else {
    houses.house = 1;
  }
  */
}

//8196 result -> full length of list so logic isn't good.

//console.log("result ", luckyHouses);
//console.log("list length ", length);
