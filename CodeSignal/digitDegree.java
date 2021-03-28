int digitDegree(int n) {
    int c=0;
    while(n>=10){
        c++;
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        n=s;
    }
    return c;
}
