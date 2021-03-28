int[] sortByHeight(int[] a) {
    int []park=a.clone();
    Arrays.sort(a);
    List <Integer> rg=new ArrayList<Integer>();
    for(int i:a)
        if(i!=-1)
            rg.add(i);
    for(int i=0,j=0;i<park.length;i++){
        if(park[i]!=-1){
            park[i]=rg.get(j);
            j++;
        }
    }
    return park;
}
