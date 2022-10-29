class Solution {
    public int divisorSubstrings(int num, int k) {
        String n=  Integer.toString(num);
        int s=0;
        //int e=i+k;
        int count=0;
        for(int i=0;i<n.length()-k+1;i++){
            String temp= n.substring(i,i+k);
            int x= Integer.parseInt(temp);
            
            if(x!=0 && num%x==0){
                count++;
            }
            ;
        }
        return count;
        
    }
}