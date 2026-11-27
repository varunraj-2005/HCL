var n = Number(prompt());
var a = new Array(0,1);
for(i = 0;i<n-2;i++){
  a[i+2] = a[i]+a[i+1];
}
console.log(a);
