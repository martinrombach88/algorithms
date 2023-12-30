class Node {
  //javascript has a native constructor method
  //you can use it to call 'this' without actually declaring each field
  constructor(value) {
    this.value = value;

    //you correctly assumed these would be empty, but again,
    //implicit this in javascript classes, not fields like in java
    this.left = null;
    this.right = null;
  }
}

class BST {
  constructor() {
    //default empty constructor, again the javascript syntax is just
    //to use the constructor method.
    this.root = null;
  }
}

function test() {
  let myBST = new BST();

  if (myBST.root === null) {
    console.log("Root: null");
  } else {
    console.log("Root:", myBST.root.value);
  }
}

test();

/*
    EXPECTED OUTPUT:
    ----------------
    Root: null

*/
