class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = nums[val] * -1;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        
        return list;
    }
}