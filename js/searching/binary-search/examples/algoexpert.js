function binarySearch(array, target) {
      var min = 0;
      var max = array.length - 1;
  
      //min will grow and max will shrink, so this condition 
      //will be met
      while (min <= max) {
        //grab middle number, math floor sets to int
          let guess = Math.floor((min+max) / 2);
  
          //if target matches, return index
          if (array[guess] === target) {
              return guess;
          }

          //else raise min
          if(array[guess] < target) {
              min = guess + 1;
          }

          //else reduce max
          if(array[guess] > target) {
              max = guess -1;
          }
      }
      
      return -1
      
  }
  
console.log(33, 'is at index', binarySearch([0, 1, 21, 33, 45,45, 61, 71,72,73], 33)); //3

console.log(73, 'is at index', binarySearch([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97], 73)); //3

