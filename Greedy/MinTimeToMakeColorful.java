//LC 1578 
// CHOOSE THE BALOON THAT TAKES MIN TIME AND REMOVE IT AND KEEP THE LARGEST VALUE IN THE ARRAY 

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int totalTime = 0;
        for(int i=1;i<n;i++)
        {
            if(colors.charAt(i) == colors.charAt(i-1))
            {
                totalTime+= Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }

        }
        return totalTime;
    }
}