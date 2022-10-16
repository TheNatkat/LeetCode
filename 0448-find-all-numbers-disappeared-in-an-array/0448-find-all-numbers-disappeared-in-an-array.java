class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i : nums){
            int index = Math.abs(i);
            if(nums[index-1]>0){
               nums[index-1] *= -1;
            } 
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
        
    }
}