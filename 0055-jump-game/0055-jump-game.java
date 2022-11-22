class Solution {
    public boolean canJump(int[] nums) {
        int replacable = 0;
        for(int i = 0; i <= nums.length-1 && i <= replacable; i++){
            replacable = Math.max(replacable, i + nums[i]);
        }
        
        if(replacable >= nums.length - 1){
            return true;
        }else{
            return false;
        }
    }
}