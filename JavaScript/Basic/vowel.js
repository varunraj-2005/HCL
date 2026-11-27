var a = String(prompt("Enter the String: "));
var b = 0;
var vow = "aeiouAEIOU"
for(i=a.length-1;i>=0;i--){
  if(vow.includes(a[i])){
    b++;
  }
}
console.log("Total number of Vowels is "+b);
