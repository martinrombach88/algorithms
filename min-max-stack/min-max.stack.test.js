const minMaxStack = require('./min-max-stack.js')


describe("Min Max Stack", () => {
    const stack = new minMaxStack()
test('ping returns pong', () => {
    expect(stack.ping()).toBe("pong")
})})

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