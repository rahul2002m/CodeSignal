 boolean areSimilar(int[] a, int[] b) {
    Stack<Integer> rg = new Stack<Integer>();
    int c=0;
    for(int i=0;i<a.length;i++){
        if(a[i]!=b[i]){
            if(rg.isEmpty()){
                rg.add(i);
                c++;
            }   
            else if(a[i]==b[rg.peek()]&&b[i]==a[rg.peek()])
                rg.pop();
        }
        if(c>=2)
            return false;
    }
    return rg.empty();
}
