class Node {
  //this is the java way. all logic should be in the constructor (?)
  // let root;
  // let left;
  // let right;

  //constructor - again using java way.
  Node(value) {
    const root = null;
    return root;
    /*
            root: parent?
            value: value
            left: null, right: null
        */
  }
}

class BST {
  BST() {
    //if Node was set up with the javascript native constructor method, this might have worked
    this.root = new Node(null);
    return this;
  }
}

let myBST = new BST();
console.log(myBST).root;
if (myBST.root === null) {
  console.log("Root: null");
} else {
  console.log("Root:", myBST.root.value);
}

/*
    EXPECTED OUTPUT:
    ----------------
    Root: null

*/
