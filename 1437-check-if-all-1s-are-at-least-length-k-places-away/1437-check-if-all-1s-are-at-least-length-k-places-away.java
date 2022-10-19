class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count=0;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                ans.add(i);
            }
        }
        
        for(int i=0; i<ans.size()-1;i++){
            int check =ans.get(i+1)-ans.get(i);
            if(check-1>=k){
                continue;
            }else{
                return false;
            }
            
        }
        return true;
        
    }
}