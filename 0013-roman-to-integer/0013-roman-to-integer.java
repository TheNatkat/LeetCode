class Solution {
    public int romanToInt(String s) {
        
        int l= s.length();
        int num=0;
        for(int i=l-1; i>=0; i--){
           if(i!=0){
            if(s.charAt(i)=='I'){
                num=num+1;
            }else if(s.charAt(i)=='V'){
                if(s.charAt(i-1)=='I'){
                    num=num+4;
                    i--;
                }else{
                    num=num+5;
                }
                
            }else if(s.charAt(i)=='X'){
                if(s.charAt(i-1)=='I'){
                    i--;
                    num=num+9;
                }else{
                    num=num+10;
                }
                
            }else if(s.charAt(i)=='L'){
                if(s.charAt(i-1)=='X'){
                    i--;
                    num=num+40;
                }else{
                    num=num+50;
                }
                
            }else if(s.charAt(i)=='C'){
                if(s.charAt(i-1)=='X'){
                    num=num+90;
                    i--;
                }else{
                    num=num+100;
                }
                
            }else if(s.charAt(i)=='D'){
                if(s.charAt(i-1)=='C'){
                    num=num+400;
                    i--;
                }else{
                    num=num+500;
                }
                
            }else if(s.charAt(i)=='M'){
                if(s.charAt(i-1)=='C'){
                    num=num+900;
                    i--;
                }else{
                    num=num+1000;
                }
                
            }
        }else{
               if(s.charAt(i)=='I'){
                   num=num+1;
               
                }else if(s.charAt(i)=='V'){
                   num=num+5;
               }else if(s.charAt(i)=='X'){
                   num=num+10;
               }else if(s.charAt(i)=='L'){
                    num=num+50;
               }else if(s.charAt(i)=='C'){
                   num=num+100;
               }else if(s.charAt(i)=='D'){
                   num=num+500;
               }else if(s.charAt(i)=='M'){
                   num=num+1000;
               }
               
      
        
        
        }
    }
    return num;
}
}