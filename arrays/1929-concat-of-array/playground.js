/**
 * @param {number[]} nums
 * @return {number[]}
 */

function getConcatenation1(nums) {
  return [...nums, ...nums];
}

//No spread solution:

function getConcatenation2(nums) {
  const result = [];
  for (let i = 0; i < nums.length; i++) {
    //copy original array into result
    result[i] = nums[i];
    console.log(result);
    //copy extra copy of array in.. why do they use length?
    result[i + nums.length] = nums[i];
    console.log(result);
  }
  return result;
}

console.log(getConcatenation2([1, 2, 1]));
