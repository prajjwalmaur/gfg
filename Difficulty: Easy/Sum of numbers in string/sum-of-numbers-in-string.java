class Solution {
    public int findSum(String s) {
        // code here
        int sum=0;
        int pl = 0 ;
        for(int i = s.length()-1 ; i >= 0 ; i-- ){
            char ch = s.charAt(i);
            if( ch >= 48 && ch < 58 ){
                sum += ((ch -48) * Math.pow(10,pl++));
            }
            else {
                pl = 0;
            }
        }
        return sum;
    }
}