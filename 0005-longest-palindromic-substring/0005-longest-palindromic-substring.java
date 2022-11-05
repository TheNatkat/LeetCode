class Solution {
    public String longestPalindrome(String S) {
        int len=0,s=0,e=0;
        for(int i=0;i<S.length(); i++){
            int p1=i,p2=i;
            while(p1>=0 && p2<S.length()){
                if(S.charAt(p1)==S.charAt(p2)){
                    p1--;
                    p2++;
                }else{
                    break;
                }
            }
            int temp=p2-p1-1;
            if(temp>len){
                len=temp;
                s=p1+1;
                e=p2;
            }
        }
        for(int i=0;i<S.length(); i++){
            int p1=i,p2=i+1;
            while(p1>=0 && p2<S.length()){
                if(S.charAt(p1)==S.charAt(p2)){
                    p1--;
                    p2++;
                }else{
                    break;
                }
            }
            int temp=p2-p1-1;
            if(temp>len){
                len=temp;
                s=p1+1;
                e=p2;
            }
        }
        return S.substring(s,e);
        
    }
}