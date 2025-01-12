//require the file system 
const fs = require("fs");
//path.join: Ensures platform-independent file paths.
const path = require("path");

// Specify the file path
const filePath = path.join(__dirname, "puzzleinput.txt");

// Read the file
fs.readFile(filePath, "utf8", (err, data) => {
  if (err) {
    console.error("Error reading the file:", err.message);
    return;
  }
  console.log("File Content:");
  console.log(data);
});

// Create a sample text file if it doesn't exist
const sampleContent = "Hello, this is a sample text file.";
if (!fs.existsSync(filePath)) {
  fs.writeFile(filePath, sampleContent, (err) => {
    if (err) {
      console.error("Error creating the sample file:", err.message);
    } else {
      console.log("Sample file created at:", filePath);
    }
  });
}
