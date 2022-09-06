class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timetaken=0;
        int n=tickets.length;
        int i=0;
        while(tickets[k]>0){
            if(tickets[i]>0){
                timetaken++;
            }
            tickets[i]--;
            i++;
            i=i%n;
        }
        
        return timetaken;
        
    }
}