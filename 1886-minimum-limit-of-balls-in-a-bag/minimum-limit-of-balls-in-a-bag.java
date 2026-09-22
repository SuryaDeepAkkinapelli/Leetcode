class Solution {
    public boolean isValid(int[] nums, int maxOperations, int penalty){
        int sum = 0;
        for(int x : nums){
            sum += (x - 1)/penalty;
            if(sum > maxOperations)return false;
        }
        return sum <= maxOperations;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int ans = -1;
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(nums, maxOperations, mid)){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }
}