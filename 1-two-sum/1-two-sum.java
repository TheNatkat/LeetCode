class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int l= nums.length;
        int A[]= new int [2];
        
        for (int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(target==nums[i]+nums[j]){
                    A[0]= i;
                    A[1]= j;
                    
                }
            }
        }
        return A;
        
    }
}