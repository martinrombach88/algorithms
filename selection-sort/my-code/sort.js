function selectionSort(array) {
//2 functions -> while with for + a swap 
    minIndex = 0;
    //while each index is being tested by the code
    while (minIndex < array.length - 1) {
      let currentIdx = minIndex;
      //for everything in the array after index 1
      //if value of i is less than currentIdx, currentIdx = i;
      for (let i = currentIdx; i < array.length; i++) {
        if (array[currentIdx] > array[i]) {
          currentIdx = i;
        }
      }
     swap(minIndex, currentIdx, array) 
     minIndex ++
    }
    return array;
  }
  
  function swap(firstIdx, lastIdx, array) {
    let temp = array[firstIdx];
    array[firstIdx] = array[lastIdx];
    array[lastIdx] = temp;
  
    return array;
  }

  

  var array = [22, 11, 99, 88, 9, 7, 42];
  console.log("Array before sorting:  " + array);
  selectionSort(array);
  console.log("Array after sorting:  " + array);

  var array2 = [10, 131, -5, 49, 9, -37, 42];
  console.log("Array2 before sorting:  " + array2);
  selectionSort(array2);
  console.log("Array2 after sorting:  " + array2);