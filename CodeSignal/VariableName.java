boolean variableName(String name) {
    char []g=name.toCharArray();
    char c=g[0];
    if(c!='_' && !(c>=65 && c<=90) && !(c>=97 && c<=122))
        return false;
    for(int i=1;i<g.length;i++){
        c=g[i];
        if(!(c>=48 && c<=57) && c!='_' && !(c>=65 && c<=90) && !(c>=97 && c<=122))
            return false;
    }    
    return true;
}