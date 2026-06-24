class Solution {
    String removeDuplicates(String s) {
        String str = "";
        for(int i = 0 ; i < s.length(); i ++){
            if ( s.indexOf(s.charAt(i)) == i ){
                str += s.charAt(i);
            }
        }
        return str;
    }
}
