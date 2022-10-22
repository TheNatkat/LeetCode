class Solution {
    public String minWindow(String s, String t) {
        HashMap <Character,Integer> required = new HashMap<>();
        
        for(int i=0 ; i<t.length(); i++){
            required.put(t.charAt(i),required.getOrDefault(t.charAt(i),0)+1);
        }
        
        HashMap<Character,Integer> acquired = new HashMap<>();
        int  found = 0;
        int l=s.length();
        int m=t.length();
        int i=0;
        int j=0;
        int count=0;
        int min = Integer.MAX_VALUE;
        String ans="";
        while(i<l){
            while(j<l && found!=m){
                
            
            char ch=s.charAt(j);
            if(required.containsKey(ch)){
               int ov=acquired.getOrDefault(ch,0);
                acquired.put(ch,ov+1);
                if(acquired.get(ch) > required.get(ch)){
                    
                }else{
                    found=found+1;
                }
            
            }
            j++;
            
            
        }
        int window_size=j-i;
        if(found==m && window_size<min){
            min=window_size;
            ans=s.substring(i,j);
        }
            if(required.containsKey(s.charAt(i))) 
            {
                int ov = acquired.get(s.charAt(i));
                acquired.put(s.charAt(i), ov-1);
                if(acquired.get(s.charAt(i)) < required.get(s.charAt(i))) found -= 1; 
            }
            
            i++;
        }
        return ans;
        
    }
}