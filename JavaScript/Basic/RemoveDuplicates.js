var a = new Array(1,2,2,4,4,5,6,5,6,7);
var b = [];
var j = 0;
for(i=0;i<a.length;i++){
  if(!b.includes(a[i])){
    b[j++] = a[i];
  }
}
console.log("Before Removing the Duplicate "+a);
console.log("After Removing the Duplicate "+b);
