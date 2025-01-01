//optional chaining
function hashIndexList(array) {
  const result = [];
  for (let i = 0; i < array.length; i++) {
    if (result.length < array.length) {
      result.push([]);
    }
    let index = array[i] % 9;
    if (result[index]) {
      result[index].push(array[i]);
    } else result[index] = [array[i]];
  }
  return result;
}

//console.log(hashIndexList([5, 28, 19, 15, 20, 33, 12, 17, 10]));

// open addressing (linear probing)
function hashIndex2(array) {
  const result = [];
  for (let i = 0; i < array.length; i++) {
    if (result.length < array.length) {
      result.push([]);
    }
    let j = i;
    let index = array[i] % array.length;
    while (result[index] && result[index].length > 0) {
      index = (index + 1) % array.length;
    }
    result[index] = [array[j]];
  }
  return result;
}

//console.log(hashIndex2([0, 22, 31, 4, 15, 28, 17, 88, 59]));

// open addressing (quadratic probing)
function hashIndex3(array) {
  const result = [];
  for (let i = 0; i < array.length; i++) {
    if (result.length < array.length) {
      result.push([]);
    }
    let j = i;
    let index = array[i] % array.length;
    let attempts = 0;

    while (
      result[index] &&
      result[index].length > 0 &&
      attempts < array.length
    ) {
      index = (index * index) % array.length;
      attempts++;
    }

    if (attempts === array.length) {
      // Break the loop if all possible positions have been tried
      console.error("Unable to insert element, table full.");
      break;
    }

    result[index] = [array[j]];
  }
  return result;
}

console.log(hashIndex3([0, 22, 31, 4, 15, 28, 17, 88, 59]));
