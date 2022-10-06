class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> Hm = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for (int i=0; i<s.length();i++){
            Hm.put(s.charAt(i),Hm.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i=0; i<t.length();i++){
            if(Hm.containsKey(t.charAt(i))){
                if(Hm.get(t.charAt(i))==1){
                    Hm.remove(t.charAt(i));
                }else{
                    Hm.put(t.charAt(i),Hm.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }
        return true;
        
    }
}