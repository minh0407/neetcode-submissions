class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            int num = 0;
            for(int j = i ;j<nums.length; j++){
                num += nums[j];
                if(num == k) {
                    res++;
                }
            }
        }
        return res;
    }
}