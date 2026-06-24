class Solution {
    static long evenNumSubstring(String S) {
        // Your code here
        long sum = 0 ;
        for( int i = S.length()-1 ; i >= 0 ; i--){
            if( ( S.charAt(i) -48 )% 2== 0 ){
                sum += i+1;
            }
        }
        return sum;
    }
}