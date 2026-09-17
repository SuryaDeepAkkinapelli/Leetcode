class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        int leftMax = -1;
        int rightMax = -1;
        while(i< j){
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            int min = Math.min(leftMax, rightMax);
            if(leftMax < rightMax){
                ans += min - height[i];
                i++;
            }else{
                ans += min - height[j];
                j--;
            }
        }
        return ans;
    }
}