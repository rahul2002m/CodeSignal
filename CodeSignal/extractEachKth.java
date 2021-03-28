int[] extractEachKth(int[] a, int k) {
    int j=0,c=0;
    for(int i=0;i<a.length;i++){
        if((i+1)%k!=0){
           c++;
        }
    }
    
    int [] g=new int[c];
    for(int i=0;i<a.length;i++){
        if((i+1)%k!=0){
            g[j]=a[i];
            j++;
        }
    }
    return g;   
}


                                (or)


int[] extractEachKth(int[] a, int k) {
    ArrayList <Integer> rg= new ArrayList<Integer>();
    for(int i=0;i<a.length;i++){
        if((i+1)%k!=0){
            rg.add(a[i]);
        }
    }
    int[] r=new int[rg.size()];
    for(int i=0;i<rg.size();i++)
        r[i]=rg.get(i);
    return r;   
}