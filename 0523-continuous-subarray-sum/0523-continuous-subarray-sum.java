class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int currsum=0, prevsum=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int n: nums){
            currsum += n;
            if(hs.contains(currsum%k)){
                return true;
            }
            currsum %= k;
            hs.add(prevsum);
            prevsum =currsum;
            
        }
        return false;
        
    }
}