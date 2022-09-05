class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l= nums.length;
        int s=0,e=l-1;
        int ans[] = new int [l];
        for(int i=0; i<l; i++){
            if(nums[i]%2==0){
                ans[s]=nums[i];
                s++;
            }else{
                ans[e]=nums[i];
                e--;
            }
        }
        return ans;
        
    }
}