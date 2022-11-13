class Solution {
    public String reverseWords(String s) {
        String array[] = s.split("\\s+");
        StringBuilder ans= new StringBuilder ();
        for(int i=array.length-1; i>=0; i--){
            ans.append(array[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}