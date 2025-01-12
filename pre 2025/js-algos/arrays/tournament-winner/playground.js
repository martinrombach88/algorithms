function tournamentWinner(competitions, results) {
  const hash = {};
  let c = 0;
  for (let result in results) {
    let r = results[result];
    let w = competitions[c][r + 1];
    let x = competitions[c][r - 1];
    if (r === 0) {
      if (hash[w]) {
        hash[w]++;
      } else {
        hash[w] = 1;
      }
    }
    if (r === 1) {
      if (hash[x]) {
        hash[x]++;
      } else {
        hash[x] = 1;
      }
    }
    c++;
  }

  //in this line:
  //reduce runs a function on the entire array
  //the value of each key is checked again each other
  //then if the value of a is bigger, a is returned
  //if b bigger b is returned
  return Object.keys(hash).reduce((a, b) => (hash[a] > hash[b] ? a : b));
}

const languageCompetition = [
  ["HTML", "C#"],
  ["C#", "Python"],
  ["Python", "HTML"],
];

const result = [0, 0, 1];

console.log(tournamentWinner(languageCompetition, result));
