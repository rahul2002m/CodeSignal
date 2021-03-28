int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    int range= statues[statues.length-1]-statues[0]+1;
    int ans =statues.length-range;
    return Math.abs(ans);
}