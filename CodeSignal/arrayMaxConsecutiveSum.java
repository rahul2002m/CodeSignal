 int arrayMaxConsecutiveSum(int[] a, int k) {
    int max = 0;  
    for(int i=0; i <= a.length - k; i++) {
        int sum=0;
        for(int j = i; j < i + k; j++) 
            sum += a[j];
        if(sum > max) 
            max = sum;
       }
       return max;
}
