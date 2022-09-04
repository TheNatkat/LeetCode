class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        if(n==1){
            return 0;
        }
        int count=0;
        for(int i=1; i<n; i++){
            if(nums[i]<=nums[i-1]){
                int diff = nums[i-1]+1-nums[i];
                nums[i]= nums[i]+diff;
                count= count+diff;
            }
        }
        return count;
        
    }
}