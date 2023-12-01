function reversedInsertionSort(array) {
  for (let i = array.length - 1; i > 0; i--) {
    var j = i + 1;
    var key = array[i];
    while (array[j] > key && j < array.length) {
      array[j - 1] = array[j];
      array[j] = key;
    }
    key = array[j - 1];
  }

  return array;
}

function test(myArray) {
  reversedInsertionSort(myArray);
  console.log(myArray);
}
let myArray = [4, 2, 6, 5, 1, 3];
test(myArray);

/*
      EXPECTED OUTPUT:
      ----------------
      [ 6, 5, 4, 3, 2, 1 ]
  
  */

let myArray2 = [20, 30, 25, 40, 50, 45];
test(myArray2);

/*
      EXPECTED OUTPUT:
      ----------------
      [ 50, 45, 40, 30, 25, 20 ]
  
  */
