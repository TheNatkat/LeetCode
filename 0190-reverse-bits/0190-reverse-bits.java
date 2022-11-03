public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int ans=0;
        for(int i=1;i<=32;i++){
            if(checkbit(i,n)){
                ans= 1<<(32-i) | ans;
            }
        }
        return ans;
        
    }
    public boolean checkbit(int i,int n){
        if(((1<< (i-1)) & n)!=0) return true;
        return false;
}
}