class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int val=1;
        int neg=0;
        if(nums[0]<0 && nums[1]<0){
            neg=nums[0]*nums[1]*nums[nums.length-1];
        }
        for(int i=1; i<4; i++){
            val=val*nums[nums.length-i];
        }
        return Math.max(val,neg);
        
    }
}