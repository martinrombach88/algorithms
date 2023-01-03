const case1 = [1, 2, 3, 1, 1, 3]; //Output: 4
const case2 = [1, 1, 1, 1]; //Output: 6
const case3 = [1, 2, 3]; //Output: 0

/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function (nums) {
  let count = 0;
  for (let i = 0; i < nums.length; i++) {
    for (let j = 1; j < nums.length; j++) {
      if (nums[i] == nums[j] && i < j) {
        count++;
      }
    }
  }
  return count;
};

console.log(
  "Case 1: " +
    numIdenticalPairs(case1) +
    "\nCase 2: " +
    numIdenticalPairs(case2) +
    "\nCase 3: " +
    numIdenticalPairs(case2)
);
