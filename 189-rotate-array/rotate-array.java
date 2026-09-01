class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0;i < nums.length / 2;i++){
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        for(int i = 0;i < (k % n)/ 2;i++){
            int temp = nums[i];
            nums[i] = nums[(k % n) - i - 1];
            nums[(k % n) - i - 1] = temp;

        }
        for(int i = 0;i < (n - (k % n)) / 2;i++){
            int temp = nums[(k % n) + i];
            nums[(k % n) + i] = nums[n - i - 1];
            nums[n - i - 1] = temp;

        }
    }
}