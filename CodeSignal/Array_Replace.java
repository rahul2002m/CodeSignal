int[] arrayReplace(int[] a, int x, int r) {
    for(int i=0;i<a.length;i++){
        if(a[i]==x)
            a[i]=r;
    }
    return a;
}