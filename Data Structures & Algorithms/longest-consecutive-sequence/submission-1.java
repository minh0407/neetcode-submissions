class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num :nums){
            list.add(num);
        }
        if(nums.length==0){return 0;}
        int count = 1;
        int maxCount=1;
        list.sort(Comparator.naturalOrder());
        for(int i  = 0 ; i<list.size()-1;i++){
         if(list.get(i).equals(list.get(i+1))){
            continue;
         }
            if(list.get(i)+1 ==list.get(i+1)){
                count++;
                maxCount= Math.max(count,maxCount);
            }
            else{
                count =1;
            }
        }
        return maxCount ;
    }
}
