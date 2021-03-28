int arrayChange(int[] inputArray) {
    int ans = 0;
		
		for(int i = 1; i < inputArray.length; i++) { 
			if(inputArray[i-1] >= inputArray[i]) { 
				int difference = Math.abs(inputArray[i - 1] - inputArray[i]) + 1 ;
				inputArray[i] += difference;
				ans += difference;
			}
		}
		return ans;
}
