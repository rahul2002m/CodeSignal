boolean isLucky(int n) {
    String s=Integer.toString(n);
    int x=s.length();
    int s1=0,s2=0;
    for(int i=0,j=x-1;i<j;i++,j--){
        s1+=Character.getNumericValue(s.charAt(i));
        s2+=Character.getNumericValue(s.charAt(j));
    }
    return s1==s2;
}
