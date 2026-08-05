class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if(n == 1)return 0;
        int ans = -1;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = nums[0];
        for(int i = 1; i< n;i++){
            pref[i] = pref[i - 1] + nums[i];
        }
        suff[n - 1]= nums[n - 1];
        for(int i = n - 2;i >= 0;i--){
            suff[i] = suff[i + 1] + nums[i];
        }
        int left = 0;
        int right = 0;
        for(int i=0;i<n;i++){
            if(i == n - 1){
                right = 0;
                left = pref[i - 1];
            }
            if(i == 0){
                left = 0;
                right = suff[i + 1];
            }
            if(i !=0 && i != n - 1){
                left = pref[i - 1];
                right = suff[i + 1];
            }
            if(left == right)return i;
        }
        return ans;

    }
}