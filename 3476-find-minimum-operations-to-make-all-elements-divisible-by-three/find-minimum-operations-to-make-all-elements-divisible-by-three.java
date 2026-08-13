class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for(int i = 0; i< nums.length;i++){
            res += Math.min(3 - (nums[i] % 3),nums[i] % 3);
        }
        return res;
    }
}