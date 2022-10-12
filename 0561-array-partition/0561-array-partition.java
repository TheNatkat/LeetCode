class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        long ans=0;
        for(int i=0; i<nums.length; i=i+2){
            ans=ans+nums[i];
        }
        return (int)ans;
    }
}