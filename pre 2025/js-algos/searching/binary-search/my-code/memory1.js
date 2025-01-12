function binarySearch(array, target) {
    //
    let min = 0;
    let max = array.length -1;  
        while (min <= max) {
            let guess = Math.floor((min+max) / 2)
            if (array[guess] === target) {
                return guess;
            }
            else if (array[guess] < target) {
                min = guess +1;
            }
            else if (array[guess] > target){
                max = guess -1;
            }
        }
        return -1;

    
}


console.log(33, 'is at index', binarySearch([0, 1, 21, 33, 45,45, 61, 71,72,73], 33)); //3

console.log(73, 'is at index', binarySearch([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97], 73)); //3

