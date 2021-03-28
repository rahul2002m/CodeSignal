int absoluteValuesSumMinimization(int[] a) {
    int x=a[0],min=0,g=x;
    for(int j=0;j<a.length;j++){
        min+=Math.abs(a[j]-x);
    }
    for(int i=1;i<a.length;i++){
        x=a[i];
        int sum=0;
        for(int j=0;j<a.length;j++){
            sum+=Math.abs(a[j]-x);
        }
        // System.out.println(sum);
        if(min>sum){
            min=sum;
            g=x;
            // System.out.println(g);
        }
    }
    return g;
}
