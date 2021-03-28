bool checkPalindrome(string s) {
    int l=s.length();
    for(int i=0;i<l;i++)
        if(s[i]!=s[l-1-i])
            return 0;
    return 1;
}
