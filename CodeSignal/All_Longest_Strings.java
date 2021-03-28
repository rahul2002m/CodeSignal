String[] allLongestStrings(String[] s) {
    if(s.length==1)
        return s;
    int max=0,c=0,x=0;
    for(int i=0;i<s.length;i++){
        int size=s[i].length();
        if(max==size)
            c++;
        else if(max<size){
            max=size;
            c=1;
        }
    }
    String [] g=new String[c];
    for(int i=0;i<s.length;i++){
        int size=s[i].length();
        if(max==size){
            g[x]=s[i];
            x++;
        }
    }
    return g;   
}