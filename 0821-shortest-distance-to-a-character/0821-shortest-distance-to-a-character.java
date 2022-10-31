class Solution {
    public int[] shortestToChar(String s, char c) {
        
           
        int l=s.length(), pos=-l; int ans[] = new int [l];
        for(int i=0; i<l; i++){
            if(s.charAt(i)==c) pos=i;
            ans[i]=i-pos;
        }
        for(int i=pos-1; i>=0; i--){
            if(s.charAt(i)==c) pos=i;
            ans[i]=Math.min(ans[i],pos-i);
        }
        return ans;
    }
}