function binarySearch(array, target) {
    // Write your code here.
      var min = 0;
      var max = array.length - 1;
  
      while (min <= max) {
          let guess = Math.floor((min+max) / 2);
  
          if (array[guess] === target) {
              return guess;
          }
          if(array[guess] < target) {
              min = guess + 1;
          }
          if(array[guess] > target) {
              max = guess -1;
          }
      }
      
      return -1
      
  }
  
console.log(33, 'is at index', binarySearch([0, 1, 21, 33, 45,45, 61, 71,72,73], 33)); //3