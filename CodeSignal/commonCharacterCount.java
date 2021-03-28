int commonCharacterCount(String s1, String s2) {
    int c=0,k;
    ArrayList<Character>c1=new ArrayList<Character>();
    ArrayList<Character>c2=new ArrayList<Character>();
    for(int i=0;i<s1.length();i++){
        c1.add(s1.charAt(i));
    }
    for(int i=0;i<s2.length();i++){
        c2.add(s2.charAt(i));
    }
    for(char i:c1){
        for(char j:c2){
            if(i==j){
                c++;
                k=c2.indexOf(j);
                c2.remove(k);
                break;
            }
        }
    }
    return c;
}
