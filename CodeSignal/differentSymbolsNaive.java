int differentSymbolsNaive(String s) {
    char c[]=s.toCharArray();
    int flag=1;
    Arrays.sort(c); 
    for(int i=0;i<c.length-1;i++)
        if(c[i]!=c[i+1])
            flag++;
            
   return flag;
}