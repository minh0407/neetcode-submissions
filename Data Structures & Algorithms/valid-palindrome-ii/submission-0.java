class Solution {
    public boolean validPalindrome(String s) {
   if(isPalindrome(s)){
    return true;
   }
   for(int i = 0 ; i<s.length();i++){
     String newS = s.substring(0,i)+s.substring(i+1);
     if(isPalindrome(newS)){
        return true;
     }

   }
   return false;
   }
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