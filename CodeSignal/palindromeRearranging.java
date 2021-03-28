boolean palindromeRearranging(String s) {
    char[] g = s.toCharArray();
    int[] o=new int[26];
    for(int i=0;i<g.length;i++)
        o[g[i]-'a']++;
    int x=0;
    for(int i=0;i<o.length;i++)
        if(o[i]%2!=0) 
            x++;
    
    return x<=1;
}
