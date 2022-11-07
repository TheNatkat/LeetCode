class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=-1;
        for(int i=0;i<nums.length; i++){
            
            if(nums[i]!=i){
              ans=i; 
              break;

            }
        }
        if(ans==-1) return nums.length;
        return ans;
        
    }
}