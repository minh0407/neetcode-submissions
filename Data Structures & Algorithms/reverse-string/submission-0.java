class Solution {
    public void reverseString(char[] s) {
     StringBuilder sb = new StringBuilder();
     for(char cha : s)
     {
        sb.append(cha);
     }   
     sb.reverse();
      for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);}
    }
}