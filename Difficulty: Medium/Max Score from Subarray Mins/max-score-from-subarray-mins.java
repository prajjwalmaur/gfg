class Solution {
    public int maxSum(int arr[]) {
        // code here
        int max = arr[0]+arr[1];
        for( int i = 2 ; i < arr.length ; i++){
            int sum = arr[i-1] + arr[i];
            if( max < sum){
                max = sum;
            }
        }
        return max;
    }
}