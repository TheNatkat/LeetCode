class Solution {
    public int numRookCaptures(char[][] board) {
        int idxi=0;
        int idxj=0;
        int ans=0;
        int block=0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='R'){
                    idxi=i;
                    idxj=j;
                }
            }
        }
        block=0;
        for(int j=idxj; j<board[0].length; j++){
            if(board[idxi][j]=='B'){
                block=1;
            }
            
            if(board[idxi][j]=='p' && block==0){
                ans++;
                break;
            }
        }
        block=0;
        for(int j=idxj; j>=0; j--){
            if(board[idxi][j]=='B'){
                block=1;
            }
            
            if(board[idxi][j]=='p' && block==0){
                ans++;
                break;
            }
        }
        block=0;
        for(int i=idxi; i<board.length; i++){
            if(board[i][idxj]=='B'){
                block=1;
            }
            
            if(board[i][idxj]=='p' && block==0){
                ans++;
                break;
            }
        }
        block=0;
        for(int i=idxi; i>=0; i--){
            if(board[i][idxj]=='B'){
                block=1;
            }
            
            if(board[i][idxj]=='p' && block==0){
                ans++;
                break;
            }
        }
        return ans;
    }
}