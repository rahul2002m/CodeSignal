boolean almostIncreasingSequence(int[] a) {
    int s=a.length;
    int c=0;
    boolean x,y;
    if(s==2)
        return true;
    for(int i=0;i<s-1;i++){ 
        if(a[i+1]<=a[i]){      
            c++;
            x=(i+2)<s && a[i+2]<=a[i];
            y=(i-1)>=0 && a[i+1]<=a[i-1];
            if(x&&y || c>=2)
                return false;
        }
    }
    return true;
}
