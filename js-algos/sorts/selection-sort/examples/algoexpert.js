function selectionSort(array) {
    let startIdx = 0;

    //outer loop is a while because...
    while (startIdx < array.length -1) {
        let smallestIdx = startIdx;
        for (let i = startIdx + 1; i < array.length; i++) {
            if (array[smallestIdx] > array[i]) smallestIdx = i;
        }
        swap(startIdx, smallestIdx, array);
        startIdx ++;
    }
    return array;
}

    function swap(i, j, array){
        const temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }


var array = [22, 11, 99, 88, 9, 7, 42];
var array2 = [11, 22, 99, 88, 9, 7, 42];
console.log("Array before sorting:  " + array);
console.log("Array2 before sorting:  " + array2);
selectionSort(array);
selectionSort(array2);
console.log("Array after sorting:  " + array);
console.log("Array2 after sorting:  " + array2);