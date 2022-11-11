class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,water=0;
        while(i<j){
            water=Math.max(water,(j-i)*Math.min(height[i],height[j]));
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return water;
    }
}