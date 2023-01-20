class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> ans = new ArrayList<>();

        //find max
        int max = 0;
        for (int i = 0; i < candies.length; i++)
        {
            max = Math.max(candies[i], max);
        }


        //compare
        for(int i = 0; i < candies.length; i++)
        {
            

             if ((candies[i] + extraCandies) < max)
             {
                 ans.add(false);
             }
             else 
                ans.add(true);

                                                                              
            
        }
        return ans;
    }
}
