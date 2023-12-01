function insertionSort(array) {
  for (let i = 1; i < array.length; i++) {
    let temp = array[i];
    for (var j = i - 1; array[j] > temp && j > -1; j--) {
      array[j + 1] = array[j];
    }
    array[j + 1] = temp;
  }
  return array;
}

function test(myArray) {
  insertionSort(myArray);
  console.log(myArray);
}
let myArray = [4, 2, 6, 5, 1, 3];
test(myArray);

/*
    EXPECTED OUTPUT:
    ----------------
    [ 1, 2, 3, 4, 5, 6 ]

*/

let myArray2 = [20, 30, 25, 40, 50, 45];
test(myArray2);

/*
    EXPECTED OUTPUT:
    ----------------
    [ 20, 25, 30, 40, 45, 50 ]

*/
