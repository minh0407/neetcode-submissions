class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ;j<n;j++){
                for(int k = j+1;k<n;k++){
                    for(int p = k+1;p<n;p++){
                        if(nums[i]+ nums[j]+0L+nums[k]+nums[p]== target){
                             res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[p]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}