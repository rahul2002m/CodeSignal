boolean evenDigitsOnly(int n) {
    String s=Integer.toString(n);
    for(int i=0;i<s.length();i++)
        if(Character.getNumericValue(s.charAt(i))%2!=0)
            return false;
    return true;
}
