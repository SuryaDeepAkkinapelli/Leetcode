class Solution {
    public int countSegments(String s) {
        if(s.length()== 0 || s.isBlank())return 0;
        return s.trim().split("\\s+").length;
    }
}