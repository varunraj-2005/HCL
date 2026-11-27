var a = String(prompt("Enter the string to check "));
var map = new Map();
for(i = 0;i<a.length;i++){
  map.set(a[i],(map.get(a[i]) ?? 0)+1);
}
console.log(map);
