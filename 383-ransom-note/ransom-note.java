class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magMap = new HashMap<>();
        
        for(char ch : magazine.toCharArray()){
            magMap.put(ch,magMap.getOrDefault(ch,0) + 1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(!magMap.containsKey(ch))return false;
            magMap.put(ch,magMap.get(ch) - 1);
            if(magMap.get(ch) == 0)magMap.remove(ch);
        }
        return true;
    }
}