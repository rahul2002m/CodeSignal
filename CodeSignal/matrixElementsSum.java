int matrixElementsSum(std::vector<std::vector<int>> matrix) {
    int c=0,i,j;
    for(i=0;i<matrix.size();i++){
        for(j=0;j<matrix[i].size();j++){
            if(i+1<matrix.size() && matrix[i][j]==0)
                matrix[i+1][j]=0;
        if(matrix[i][j]!=0)
            c+=matrix[i][j];
        }
    }
    return c;
}