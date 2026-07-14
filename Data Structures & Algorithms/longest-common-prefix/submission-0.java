class Solution {
    public String longestCommonPrefix(String[] strs) {
        String goc = strs[0];
        for(int i = 0 ; i<strs.length;i++ ){
            int j = 0 ; 
            while(j<Math.min(goc.length(), strs[i].length())){
                if(goc.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            goc = goc.substring(0,j);
        }
        return goc;
    }
}