char firstDigit(String s) {
    char c='0';
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            c=s.charAt(i);
            break;
        }
    }
    return c;
}
