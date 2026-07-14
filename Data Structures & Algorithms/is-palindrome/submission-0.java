class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();
       for(char ss : s.toCharArray()){
         if (Character.isLetterOrDigit(ss)) {
                sb.append(Character.toLowerCase(ss));
            }

       }
return  sb.toString().equals(sb.reverse().toString());
    }
    
}
