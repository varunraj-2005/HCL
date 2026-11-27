var a = String(prompt("Enter the string to check "));
var b = a.split("").reverse().join("");
if(a===b){
  console.log("The given string is the palindrome");
}
else console.log("The given string is not a palindrome");
