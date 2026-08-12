class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[friends.length];
        for(int i = 0; i < friends.length;i++){
            set.add(friends[i]);
        }
        int k = 0;
        for(int i = 0; i < order.length;i++){
            if(set.contains(order[i])){
                res[k] = order[i];
                k++;
            }
        }
        return res;
    }
}