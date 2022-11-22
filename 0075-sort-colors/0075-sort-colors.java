class Solution {
    public void sortColors(int[] nums) {
        int left= 0;
        int middle = 0;
        int right = nums.length - 1;
        
        while( middle <= right){
            if(nums[middle] == 0){
                swap(left, middle, nums);
                left++;
                middle++;
            }else if(nums[middle] == 1){
                middle++;
            }else{
                swap(right, middle, nums);
                right --;
            }
        }
    }
    
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}