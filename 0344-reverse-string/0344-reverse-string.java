class Solution {
    public void function(int l,int r,char[] s){
            if(l>=r) return;       
            char temp= s[l];
            s[l]=s[r];
            s[r]=temp;
            function(++l,--r,s);
        
    }
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        function(l,r,s);
        
      
    }
}