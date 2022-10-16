class Solution {
    public int minimumSum(int num) {
        int a[]= new int [4];
        int i=0;
        while(num>0){
            int temp=num%10;
            a[i]=temp;
            i++;
            num=num/10;
        }
        
        Arrays.sort(a);
        
        return (a[0]*10+a[2])+(a[1]*10+a[3]);
        
    }
}