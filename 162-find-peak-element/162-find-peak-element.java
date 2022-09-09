class Solution {
    public int findPeakElement(int[] nums) {
       int N = nums.length;
       int L = 0;
       int H = N-1;
       while(L < H){
           int Mid = L + (H-L)/2;
           if(nums[Mid] < nums[Mid+1]) L = Mid+1;
           else H = Mid;
       }
       return L;
    }
}
