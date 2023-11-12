/*
recreate the array map function manually
map(callbackFn) only
*/
Array.prototype.myMap = function(func) {
    for (let i = 0; i < this.length; i++) {
        func(this[i]);
    }
}

[1,2,3].myMap(console.log);
["a","b","c"].myMap(console.log);