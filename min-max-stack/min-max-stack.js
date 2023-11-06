module.exports = class MinMaxStack {
    constructor() {
      //arrays are stacks, last value is top (lifo)
      //regular stack
      this.stack = []
      //extra stack for maintaining min/max 
      this.minMaxStack = []
    }
    
    peek() {
      //return the top of the extra stack
      return this.minMaxStack[this.minMaxStack.length - 1]
    }
  
    pop() {
      //return the top of regular and align the min max with it
      this.minMaxStack.pop();
      return this.stack.pop();
    }
  
    push(number) {
      // make new object from arg
      let newMinMax = {"min": number, "max": number};
      //if array not empty
      if (this.minMaxStack.length > 0) {
        // create temp value from 
        let lastMinMax = this.minMaxStack[this.minMaxStack.length -1]
  
        //set new values to newMinMax stack
        newMinMax['min'] = Math.min(lastMinMax["min"], number)
        newMinMax['max'] = Math.max(lastMinMax["max"], number)
  
        this.stack.push(newMinMax)
        this.minMaxStack.push(newMinMax)
      }
    }
    getMin() { 
      //return min value of last object
      return this.minMaxStack[this.minMaxStack.length - 1]["min"]
    }
  
    getMax() {
       return this.minMaxStack[this.minMaxStack.length - 1]["max"]
    }

    ping() {
        return "pong";
    }
  }
  
//   // Do not edit the line below.
//   exports.MinMaxStack = MinMaxStack;
  