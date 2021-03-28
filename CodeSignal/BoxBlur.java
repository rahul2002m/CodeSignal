int[][] boxBlur(int[][] image) {
    int r=image.length,g=image[0].length;
    int [][] a=new int [r-2][g-2];
    for(int i=1;i<r-1;i++)
        for(int j=1;j<g-1;j++)
            a[i-1][j-1]=getAvg(image,i,j);
   return a; 
}
int getAvg(int [][] a,int i,int j){
    return (
        a[i-1][j-1] + a[i-1][j] + a[i-1][j+1]+
        a[i][j-1] + a[i][j] + a[i][j+1]+
        a[i+1][j-1] + a[i+1][j] + a[i+1][j+1]
    )/9;
}