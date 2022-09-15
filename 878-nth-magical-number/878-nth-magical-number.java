class Solution {
    public int gcd(int a, int b){
        if(a==0){
            return b;
        }
        
        return gcd(b%a, a);
    }
    public int nthMagicalNumber(int n, int a, int b) {
        
        long l=0,h=1000000000000000L,ans=0;
        long lcm=a*b/gcd(a,b);

        while(l<=h){
            long mid=l+((h-l)/2);
            long k= mid/a + mid/b - mid/lcm;
            if(n<=k){
                h=mid-1;
                ans=mid;
            }else{
                l=mid+1;
            }
        }
        return (int)(ans%1000000007);
        
    }
}