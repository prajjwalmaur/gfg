class Solution {
    public ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> ans  = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i<= n ; i++){
            // System.out.println(ans);
            int carry = 0 ;
            int s = ans.size();
            for( int j = 0 ; j < s; j++ ){
                int num = ans.get(j)*i + carry;
                ans.set( j, (num%10));
                carry = (int)Math.floor(num/10.0);
            }
            while(carry != 0 ){
                ans.add(carry%10);
                carry = (int)Math.floor(carry/10.0);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}