class Solution {
    public boolean checkOnesSegment(String s) {
        int l= s.length();
        int c=0;
        // if(l==1 && s.charAt(i)=='1' ){
        //     return 
        // }
        for(int i=0; i<l; i++){
            if(s.charAt(i)=='0'){
                c=1;
            }
            if(c==1 && s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
    }
}