var swap = function(array, firstIndex, secondIndex) {
    var temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
};

var indexOfMinimum = function(array, startIndex) {
    var minValue = array[startIndex];
    var minIndex = startIndex;

    for(var i = minIndex + 1; i < array.length; i++) {
        if(array[i] < minValue) {
            minIndex = i;
            minValue = array[i];
        }
    } 
    return minIndex;
}; 

var selectionSort = function(array) {
    var target;
    for (var i = 0; i < array.length - 1; i++) {
        target = indexOfMinimum(array, i);
        swap(array, i, target);
    }
};

var array = [22, 11, 99, 88, 9, 7, 42];
console.log("Array before sorting:  " + array);
selectionSort(array);
console.log("Array after sorting:  " + array);

var array2 = [10, 131, -5, 49, 9, -37, 42];
console.log("Array2 before sorting:  " + array2);
selectionSort(array2);
console.log("Array2 after sorting:  " + array2);