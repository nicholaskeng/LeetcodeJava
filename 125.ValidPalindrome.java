class Solution {
    public boolean isPalindrome(String s) {

        if (s == "")
            return true;
        
        //This is to get rid of non-alphanumeric characters
        String newString = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
                newString += s.charAt(i);
        }

        //make newString all lowercase letters
        newString = newString.toLowerCase();

        //compare one pointer (front) to the other pointer (end)
        int pointer_1 = 0;
        int pointer_2 = newString.length()-1;

        /*for(int i = 0; i < newString.length(); i++)
        {
            if (newString.charAt(i) != newString.charAt(pointer_2))
                return false;

            pointer_2--;
        }
        */
        while(pointer_1 <= pointer_2)
        {

            if(newString.charAt(pointer_1) != newString.charAt(pointer_2))
            {
                return false;
            }
            pointer_1++;
            pointer_2--;
        }
        
        return true;
    }
}
