int centuryFromYear(int year) {
    // return year/100+(year%100 != 0?1: 0);
    
    int n=year/100;
    if((year%100)!=0)
        return n+1;
    else
        return n;
}
