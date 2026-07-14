class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uni = new LinkedHashSet<>();
        for(int num : nums){
            uni.add(num);
        }
        int i = 0 ; 
        for (int num : uni) {
        nums[i] = num;
        i++;
    }
        return uni.size();
    }
}