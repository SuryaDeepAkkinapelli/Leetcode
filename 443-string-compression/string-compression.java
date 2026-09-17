class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < chars.length){
            char ch = chars[i];
            int c = 0;
            while(i < chars.length && chars[i] == ch){
                i++;
                c++;
            }
            sb.append(ch);
            if(c > 1){
                sb.append(c);
            }
        }
        String s = sb.toString();
        for(int j = 0;j < s.length();j++){
            chars[j] = s.charAt(j);
        }
        return s.length();
    }
}