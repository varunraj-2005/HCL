var a = new Array(1,2,3,5,6);
var sum= 0;
var asum=0;
for(i = 0;i<a.length;i++){
  sum+=a[i];
}
for(j=1;j<=a.length+1;j++){
  asum+=j;
}
console.log("The missing element is "+(asum-sum));
