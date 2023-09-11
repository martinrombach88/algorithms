//Linked Lists

console.log("it's working");

//a class to be instantiated over and over by
//LinkedList functions
class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class LinkedList {
  constructor(value) {
    //create a linked list with the value
    const newNode = new Node(value);
    this.head = newNode;
    this.tail = this.head;
    this.length = 1;
  }

  push(value) {
    const newNode = new Node(value);
    // if linked list is empty
    if (!this.head) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      //both tail and head's next are set to the new node
      this.tail.next = newNode;
      this.tail = newNode;
    }
    this.length++;
    //return the entire linkedlist, i.e. this
    return this;
  }
}

//be aware -> google chrome dev tools displays the linked list differently to the node.js dev tools
let myLinkedList = new LinkedList(7);
myLinkedList.push(5);

console.log("my linked list", myLinkedList);
