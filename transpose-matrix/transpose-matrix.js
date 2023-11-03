
function transposeMatrix(matrix) {
    // Write your code here.
    const newM = [];
  
    //each column is same length, so only need 0 for length
    for (let i = 0; i < matrix[0].length; i++) {
      //make a new row to make new matrix
      let newR = [];
  
      //for length of matrix
      for (let j = 0; j < matrix.length; j++) {
        //push index 0 from current array into newR
        //so index 0 of 0, 1, 2 etc
        newR.push(matrix[j][i]);
      }
      //push the array you made into the matrix
      newM.push(newR);
    }
    
    return newM;
  }

const matrix = [
[1,2,3],
[4,5,6],
[7,8,9]
]

console.log(transposeMatrix(matrix));
 //[ [ 1, 4, 7 ], 
 //[ 2, 5, 8 ], 
 //[ 3, 6, 9 ] ]
