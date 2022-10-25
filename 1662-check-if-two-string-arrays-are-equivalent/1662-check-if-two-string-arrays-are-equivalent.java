class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuffer sb1 = new StringBuffer();
      for(int i = 0; i < word1.length; i++) {
         sb1.append(word1[i]);
      }
        
    StringBuffer sb2 = new StringBuffer();
      for(int i = 0; i < word2.length; i++) {
         sb2.append(word2[i]);
      }
        
        String one = sb1.toString();
        String two = sb2.toString();
        if(one.length()!=two.length()){
            return false;
        }
        for(int i=0; i<one.length(); i++){
            if(one.charAt(i)!=two.charAt(i)){
                return false;
            }
        }
        return true;
    }
}