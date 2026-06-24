class Solution {
    public String reverseWords(String s) {
        // Code here
        String [] arr = s.split(" ");
        String ans = "";
        for ( int i = 0 ; i < arr.length ; i++ ){
            // System.out.println("dsf ,"+ arr[i] + "ewf");
            if (arr[i].length() == 0 ){
                continue;
            }
            for (int j = arr[i].length()-1; j >= 0 ; j--){
                ans+= arr[i].charAt(j);
            }
            ans += " ";
        }
        return ans.substring(0, ans.length() -1);
    }
}
