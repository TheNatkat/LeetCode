class Solution {
    public int GCD(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        return GCD(b%a,a);
        
    }
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        
        return GCD(max,min);
        
    }
}