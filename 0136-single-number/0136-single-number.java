class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <= nums.length - 1; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }

        return set.iterator().next();
    }
}