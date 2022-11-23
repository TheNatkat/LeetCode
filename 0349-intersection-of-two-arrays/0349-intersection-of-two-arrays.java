class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int nums: nums1) hs.add(nums);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int nums: nums2){
            if(hs.contains(nums)){
                temp.add(nums);
                hs.remove(nums);
            }
        }
        int ans[] = new int [temp.size()];
        int i=0;
        for(int x: temp){
            ans[i]= x;
            i++;
        }
        return ans;
        
    }
}