var n = 5;
var a = new Array(10,20,30,40,50);
var max = -Infinity ;
for(i=0;i<n;i++){
  if(a[i]>max){
    max=a[i];
  }
}
console.log("The maximum number in the Array is "+max)