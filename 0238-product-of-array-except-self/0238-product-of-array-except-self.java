class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] premitiveProduct = new int[nums.length];
        premitiveProduct[0] = 1;
        for(int i = 1; i < nums.length; i++){
            premitiveProduct[i] = premitiveProduct[i-1] * nums[i-1];
        }
        
        int secondaryProduct = 1;
        for(int i = nums.length -1; i >= 0; i--){
            premitiveProduct[i] = premitiveProduct[i] * secondaryProduct;
            secondaryProduct = secondaryProduct * nums[i];
        }
    
        return premitiveProduct;
    }
}