int avoidObstacles(int[] a) {
    Arrays.sort(a);
    int c=0;   
    for(int i=1;;i++){ 
        c=0;           
        for(int j:a){  
            if(j%i==0)     
                break;
            else
                c++;
        }
        if(c==a.length) 
            return i;  
    }
}
