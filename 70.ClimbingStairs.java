//* IMPORTANT

class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
    
    //fib(n) == fib(n-1) + fib(n-2)
    //n == 3 - 1 = 2
    //fib(3) = fib(2) + fib(1)
        if(map.containsKey(n))
            return map.get(n);
        

        if(n < 0)
            return 0;

        if ( n == 0 || n == 1)
        {
            return 1;
        }

        else 
        {
            int ans = climbStairs(n - 1) + climbStairs(n - 2);
                //3       //2                   //1

            map.put(n, ans); 
            return ans;
        }
    }   
}
