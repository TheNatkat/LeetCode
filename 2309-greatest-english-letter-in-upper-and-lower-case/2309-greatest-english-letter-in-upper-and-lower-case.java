class Solution {
    public String greatestLetter(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            hs.add(s.charAt(i));
        }
        
        for(char ch = 'Z'; ch>='A'; ch--){
            if(hs.contains(ch) && hs.contains((char)('a'+(ch - 'A')))){
                return ""+ch;
            }
        }
        return "";
        
        
    }
}