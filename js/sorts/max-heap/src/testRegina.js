import MaxHeap from "./regina.js";

const test = new MaxHeap();

//builds a max heap automatically
test.buildHeap([23, 1, 90, 78, 45, 12]);

console.log(test.peek());
console.log(test.print());
