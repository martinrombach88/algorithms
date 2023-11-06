const minMaxStack = require('./min-max-stack.js')


describe("Min Max Stack", () => {
    const stack = new minMaxStack()
test('ping returns pong', () => {
    expect(stack.ping()).toBe("pong")
})

//https://jestjs.io/docs/expect
test('push and pop 5', () => {
    stack.push(5)
    console.log(stack)
    expect(stack.pop()).toBe({"max": 5, "min": 5})
})

})

/*

  "classMethodsToCall": [
    {
      "arguments": [5],
      "method": "push"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    },
    {
      "arguments": [7],
      "method": "push"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    },
    {
      "arguments": [2],
      "method": "push"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    },
    {
      "arguments": [],
      "method": "pop"
    },
    {
      "arguments": [],
      "method": "pop"
    },
    {
      "arguments": [],
      "method": "getMin"
    },
    {
      "arguments": [],
      "method": "getMax"
    },
    {
      "arguments": [],
      "method": "peek"
    }
  ]
}
*/