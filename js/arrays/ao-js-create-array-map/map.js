/*
recreate the array map function manually
map runs the callback on each value in an array
and returns an array of values based on that function
if console.log is entered, console.log doesn't
return anything, so comes back undefined

map(callbackFn) only
*/
Array.prototype.myMap = function(func) {
    const mapped = [];
    // for (let val in this) {
    //     mapped.push(func(this[val]));
    // }
    //why doesn't it work in for in?
    for (let i = 0; i < this.length; i++) {
        mapped[i] = func(this[i]);
    }
    // return mapped;
}

const arr1 = [1,2,3].myMap(console.log);
const arr2 = ["a","b","c"].myMap(console.log);
const arr3 = [1,2,3].myMap((item) => item * 2);
console.log(arr1); // array of console.log the function * 3, 
//console.log doesn't return a value so undefined is returned
console.log(arr2); //see above

console.log(arr3); //2, 4, 6

