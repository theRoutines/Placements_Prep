class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        
        Integer[] idx = new Integer[n];  // THIS IS AN INDEX ARRAY, TO KKEEP TRACK OIF INDEX;
        
        for(int i=0;i<n;i++)
        {
            idx[i] = i;
        }
        
        Arrays.sort(idx,(a,b)->finish[a]-finish[b]);  // SORT ARRA BASED ON FINISH TIME 
        
        int count = 1;
        int lastEnd = finish[idx[0]];
        
        for(int i=1;i<n;i++)
        {
            if(start[idx[i]]>lastEnd)
            {
                count++;
                lastEnd = finish[idx[i]];
                
            }
        }
        return count;
        
    }
}
