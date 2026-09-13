class Solution {
    public boolean isValid(int[] arr, double H, int speed){
        double sum = 0;
        for(int i  =0 ;i < arr.length;i++){
            if(i == arr.length - 1){

                sum += (double)arr[i] / speed;
            }else{

                sum += Math.ceil((double)arr[i] / speed);
            }
            if(sum > H)return false;
        }
        return sum <= H;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int ans = -1;
        int low = 1;
        // int high = Arrays.stream(dist).max().getAsInt();
        int high = (int)1e7;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(dist, hour, mid)){
                ans = mid;
                high = mid -1;
            }else low = mid + 1;
        }
        return ans;
    }
}