int[] alternatingSums(int[] a) {
    int s=0,t=0;
int b[]=new int[2];
 for(int i=0;i<a.length;i++){
     if(i%2!=0)
     s=s+a[i];
     else
     t=t+a[i];
 }
b[0]=t;
b[1]=s;
return b;
}
