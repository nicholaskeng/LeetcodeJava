class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            
            String w1 = "";
            String w2 = "";
            for (int i = 0; i < word1.length; i++)
            {
                w1 += word1[i];
            }

            for (int i = 0; i < word2.length; i++)
            {
                w2 += word2[i];
            }
        
            //if(w1.length() != w2.length())
                //return false;

            //for(int i = 0; i < w1.length(); i++)
            //{
                //if(w1.charAt(i) != w2.charAt(i))
                    //return false;
            //}


            return w1.equals(w2);
    }
}
