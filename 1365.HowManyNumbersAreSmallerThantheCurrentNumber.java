class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] Ans = new int[nums.length];
        //compare
        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(j != i && nums[j] < nums[i])
                    count++;       
            }
            Ans[i] = count; 
        }
        return Ans;
    }
}
