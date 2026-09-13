class Solution {
    public boolean isValid(int[] arr, int D, int capacity){
        int sum = 0;
        int minDays = 1;
        for(int x : arr){
            sum += x;
            if(minDays > D)return false;
            if(sum > capacity){
                sum = x;
                minDays++;
            }
        }
        return minDays <=  D;
    }
    public int shipWithinDays(int[] weights, int days) {
        int ans = -1;
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(weights, days, mid)){
                ans = mid;
                high = mid - 1;
            }else low = mid + 1;
        }
        return ans;
    }
}