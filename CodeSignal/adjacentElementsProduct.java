int adjacentElementsProduct(arr_integer inputArray) {
    int max = inputArray.arr[0] * inputArray.arr[1];
    for(int i=1; i<inputArray.size-1; i++) {
        int product = inputArray.arr[i] * inputArray.arr[i+1];
        if (max < product) max = product;
    }
    return max;
}