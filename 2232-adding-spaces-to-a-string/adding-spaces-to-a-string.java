class Solution {
    public String addSpaces(String s, int[] spaces) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(idx < spaces.length && i == spaces[idx]){
                sb.append(" ");
                idx++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}