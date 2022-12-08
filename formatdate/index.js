function formatDate(userDate) {
  // format from M/D/YYYY to YYYYMMDD
  let array = userDate.split("/").reverse().join("");
  let date = new Date(array[3], array[1], array[2]);
  return date;
}

console.log(formatDate("12/31/2014"));

console.log("Format Date Coding Challenge");
