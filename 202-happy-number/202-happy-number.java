class Solution {
    public int getnum(int n){
        int tt =0;
        while(n>0){
            int t= n%10;
            n= n/10;
            tt = tt+t*t;
        }
        return tt;
    }
    public boolean isHappy(int n) {
        HashSet <Integer> hs = new HashSet <>();
        while(n!=1 && !hs.contains(n)){
            hs.add(n);
            n = getnum(n);
        }
        
        if(n==1){
            return true;
        }
        return false;
        
    }
}