class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = false;
        boolean innerUpp = false;
        boolean innerLow = false;
        if(Character.isUpperCase(word.charAt(0)))flag = true;
        if(flag){
            for(int  i =1;i < word.length();i++){
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch)){
                    innerUpp = true;
                }
                if(Character.isLowerCase(ch)){
                    innerLow = true;
                }
            }
            if(innerUpp && innerLow)return false;
            else return true;
        }else{
            for(int i = 1; i < word.length();i++){
                char ch = word.charAt(i);
                if(Character.isUpperCase(ch)){
                    return false;
                }
            }
        }
        return true;
    }
}