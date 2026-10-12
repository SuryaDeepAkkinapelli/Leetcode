class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] NGE = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < arr.length;i++){
            while(!stk.isEmpty() && arr[i] > arr[stk.peek()]){
                int ele = stk.pop();
                NGE[ele] = (i - ele);
            }

            stk.push(i);
        }
        return NGE;
    }
}