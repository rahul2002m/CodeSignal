int arrayMaximalAdjacentDifference(int[] inputArray) {
    int a=Integer.MIN_VALUE;
    for(int i=0;i<inputArray.length-1;i++)
        a=Integer.max(a, Math.abs(inputArray[i]-inputArray[i+1]));
    return a;
}
