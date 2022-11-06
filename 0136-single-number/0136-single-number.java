class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int x: hm.keySet()){
            if(hm.get(x)==1){
                ans=x;
            }
        }
        return ans;
        
    }
}