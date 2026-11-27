var a = String(prompt("Enter the String: "));
var b = "";
for(i=a.length-1;i>=0;i--){
  b+=a[i];
}
console.log(b);
console.log(a.split("").reverse().join(""));
