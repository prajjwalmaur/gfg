class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayDeque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        // q.add(0);
        for(int i = 0 ; i < arr.length; i++){
            // System.out.println(q);
            while( q.size() > 0 && arr[q.getLast()] <= arr[i] ){
                q.removeLast();
            }
            // System.out.println(q);
            if (q.isEmpty()){
                q.add(i);
                ans.add(i+1);
            }
            else{
                ans.add( i - q.getLast() );
                q.add(i);
            }
        }
        return ans;
    }
}