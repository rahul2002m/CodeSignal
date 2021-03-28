boolean isIPv4Address(String s) {
    
    int dot=0;
    
    for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='.')
            dot++;   
            
    if(dot!=3)
        return false;
    
    for(int i=0;i<s.length();i++){
        String g="";
        while(i<s.length() && s.charAt(i)!='.'){ 
            boolean x=Character.isDigit(s.charAt(i));
            if(!x)
                return false;
            g+=s.charAt(i);
            i++;
        }
        if(g.isEmpty() || g.length()>3 || Integer.valueOf(g)<0 || Integer.valueOf(g)>255 || (g.length()>1 && g.charAt(0)=='0'))
            return false;
    }
    return true;
}
