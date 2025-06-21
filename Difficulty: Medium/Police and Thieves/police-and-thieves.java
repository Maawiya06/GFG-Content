class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n = arr.length;
        
        Queue<Integer> police = new LinkedList<>();
        Queue<Integer> Thief = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 'P'){
                police.add(i);
            }
            if(arr[i] == 'T'){
                Thief.add(i);
            }
        }
        
        int count= 0;
        //match police to the thief by using 2 pointer
        while(!police.isEmpty() && !Thief.isEmpty()){
            int pIndex = police.peek();
            int tIndex = Thief.peek();
            
            if(Math.abs(pIndex - tIndex) <= k){
                count++;
                police.poll();
                Thief.poll();
            }
            else if(tIndex < pIndex){
                Thief.poll();
            }
            else{
                police.poll();
            }
        }
        
        return count;
    }
}