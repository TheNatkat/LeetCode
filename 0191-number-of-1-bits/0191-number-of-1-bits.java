public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans=0;
        for(int i=0; i<32; i++){
            if(((1 << (i - 1)) & n) != 0){
                ans++;
            }
        }
        return ans;
        
    }
}