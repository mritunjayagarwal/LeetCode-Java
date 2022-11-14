class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        
// Using XOR gate for Duplicate Detection
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        
        return ans;
        
// Bruteforce Method
//         Set<Integer> set = new HashSet<>();
//         for(int i = 0; i <= nums.length - 1; i++){
//             if(set.contains(nums[i])){
//                 set.remove(nums[i]);
//             }else{
//                 set.add(nums[i]);
//             }
//         }

//         return set.iterator().next();
    }
}