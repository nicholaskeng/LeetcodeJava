class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        if (x == reverse(x))
            return true;

        return false;
        
    }


    // Function to reverse the number
    static int reverse(int n){
       
      int rev = 0; // reversed number
      int rem;   // remainder
       
      while(n>0){
          
        rem = n%10;
        rev = (rev*10) + rem;
        n = n/10;
      }
       
      return rev;
    }
}
