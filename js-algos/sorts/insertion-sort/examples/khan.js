/*
var ;
for( = ; ; ) {
    array[ + 1] = ;
}   
*/

/*
Fix the insert function to correctly insert the given value into the array.

In order to (put the array in ascending order), the insert function will need to make room for value by moving items that are greater than value to the right. It should start at rightIndex, and stop when it finds an item that is less than or equal to value, or when it reaches the beginning of the array. Once the function has made room for value, it can write value to the array.

Although there are many ways to write this function, you should write it in a way that is consistent with the hint code.
*/

var insert = function(array, rightIndex, value) {
    
    for (var i = rightIndex; i > 0; i--) {

    }

};

var array = [3, 5, 7, 11, 13, 2, 9, 6];

insert(array, 4, 2);
console.log("Array after inserting 2:  " + array);
//Program.assertEqual(array, [2, 3, 5, 7, 11, 13, 9, 6]);

insert(array, 5, 9);
console.log("Array after inserting 9:  " + array);
//Program.assertEqual(array, [2, 3, 5, 7, 9, 11, 13, 6]);

insert(array, 6, 6);
console.log("Array after inserting 6:  " + array);
//Program.assertEqual(array, [2, 3, 5, 6, 7, 9, 11, 13]);
