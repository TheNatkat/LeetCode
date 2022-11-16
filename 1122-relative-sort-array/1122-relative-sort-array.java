class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int x : arr1) hm.put(x,hm.getOrDefault(x,0)+1);
        int j=0;
        for(int i=0; i<arr2.length; i++){
            if(hm.containsKey(arr2[i])){
                int num=hm.get(arr2[i]);
                while(num>0){
                    arr1[j] = arr2[i];
                    j++;
                    num--;
                }
                hm.remove(arr2[i]);
            }
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int x: hm.keySet()){
            int num=hm.get(x);
            while(num>0){
                    temp.add(x);
                    num--;
                }
        }
        Collections.sort(temp);
        for(int x: temp){
            arr1[j] = x;
            j++;
        }
        return arr1;
    }
}