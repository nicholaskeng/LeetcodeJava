class Solution {
    public int largestAltitude(int[] gain) {
        
        int startAlt = 0;
        int currAlt = 0;

        for(int climb : gain)
        {
            currAlt += climb;
            startAlt = Math.max(startAlt, currAlt);
        }
        return startAlt;
    }
}

//Math.max(a, b)
