class Solution {
    public int firstMissingPositive(int[] nums) {
    Arrays.sort(nums); 
    int ex =1 ;
      for(int num : nums){
        if(num <ex){
            continue;
        }
        if(num==ex){
            ex ++;
        }
        else{
            return ex;
        }
      }
  return ex;
    } 
}