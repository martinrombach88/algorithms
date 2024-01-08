const tree = {
  val: 2,
  left: {
    val: 1,
    left: null,
    right: null,
  },
  right: {
    val: 3,
    left: null,
    right: {
      val: 4,
      left: null,
      right: null,
    },
  },
};

let arr = [];

function inOrder(tree, arr) {
  if (tree == null) return;

  inOrder(tree.left, arr);
  arr.push(tree.val);
  inOrder(tree.right, arr);
  return arr;
}

console.log(inOrder(tree, arr));
