class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        for(int i = nums[0];i < nums[nums.length-1];i++){
            lst.add(i);
        }
        for(int i = 0;i < nums.length;i++){
            lst.remove(Integer.valueOf(nums[i]));
        }
        return lst;
    }
}