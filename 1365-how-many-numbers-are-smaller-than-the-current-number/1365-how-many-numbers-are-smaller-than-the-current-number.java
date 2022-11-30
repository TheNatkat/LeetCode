class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int copyarr[] = nums.clone();
        Arrays.sort(copyarr);
        
        for(int i=0; i<copyarr.length; i++){
            hm.putIfAbsent(copyarr[i],i);
        }
        
        for(int i=0 ;i<nums.length; i++){
            copyarr[i]=hm.get(nums[i]);
        }
        return copyarr;        
    }
}