var n = 5;
var a = new Array(10,7,3,48,51);
var max = -Infinity ;
for(i=0;i<n;i++){
  if(isprime(a[i])){
  console.log(a[i]+" is Prime Number");
  }
  else{
    console.log(a[i]+" is Not a Prime Number");
  }
}

function isprime(k){
  if(k==2) return true;
  if(k%2==0) return false;
  for(j=3;j<k/2;j++){
    if(k%j==0) return false;
  }
  return true;
}
