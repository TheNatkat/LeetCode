class Solution {
    public boolean checkString(String s) {
        boolean check = false;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && check == true){
                return false;
            }
            if(s.charAt(i)=='b'){
                check=true;                
            }
        }
        return true;
        
    }
}