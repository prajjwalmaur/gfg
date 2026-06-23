class Solution {
    
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < arr.length ; i++){
            if ( max.size() < k  ){
                max.add(arr[i]);
            }
            else{
                if( arr[i] < max.peek() ){
                    max.remove();
                    max.add(arr[i]);
                }
            }
        }
        return max.peek();
    }
}
