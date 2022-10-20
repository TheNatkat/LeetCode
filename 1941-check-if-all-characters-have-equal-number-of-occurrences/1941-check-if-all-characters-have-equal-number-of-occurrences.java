class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        int check[] = new int [hm.size()];
        int j=0;
        for(int x : hm.values()){
            check[j] = x;
            j++;
        }
        
        for(int i=0; i<check.length-1; i++){
            if(check[i]!=check[i+1]){
                return false;
            }
        }
        return true;
    }
}