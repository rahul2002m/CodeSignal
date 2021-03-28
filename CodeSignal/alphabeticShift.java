String alphabeticShift(String s) {
    char[] g=s.toCharArray();
    for(int i=0;i<g.length;i++){
        if(g[i]=='z')
            g[i]='a';
        else
            g[i]++;
    }
    String a=new String(g);
    return a;
}
                                 