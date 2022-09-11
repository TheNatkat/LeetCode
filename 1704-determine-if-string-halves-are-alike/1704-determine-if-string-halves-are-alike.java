class Solution {
    public boolean isvovel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }else{
            return false;
        }
    }
    public boolean halvesAreAlike(String s) {
        
        int start=0,end=s.length()-1,sc=0,se=0;
        while(start<=end){
            if(isvovel(s.charAt(start))){
                sc++;
            }
            if(isvovel(s.charAt(end))){
                se++;
            }
            start++;
            end--;
            
        }
        if(sc==se){
            return true;
        }else{
            return false;
        }
    }
}
        
        
