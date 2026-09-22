class Solution {
    public boolean isValid(int[] candies, long k, int mid){
        long sum  =0;
        for(int x : candies){
            sum += (long)x / mid;
        }
        return sum >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        int ans = 0;
        if(Arrays.stream(candies).asLongStream().sum() < k)return ans;
        int low = 1;
        int high = Arrays.stream(candies).max().getAsInt();
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(candies, k, mid)){
                ans = mid;
                low = mid + 1;
            }else high = mid - 1;
        }
        return ans;
        
    }
}