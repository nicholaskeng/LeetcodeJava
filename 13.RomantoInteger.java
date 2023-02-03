class Solution {
    public int romanToInt(String s) {
        
        int ans = 0;

        Map<Character, Integer> hm
            = new HashMap<Character, Integer>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        //hm.put("a", new Integer(100));

        //if im given III, return 3

        for(int i = 0; i < s.length(); i++)
        {
            if(i > 0 && s.charAt(i) == 'V' && s.charAt(i-1) == 'I' || i > 0 && s.charAt(i) == 'X' && s.charAt(i-1) == 'I')
                ans -= 2;
            
            if(i > 0 && s.charAt(i) == 'L' && s.charAt(i-1) == 'X' || i > 0 && s.charAt(i) == 'C' && s.charAt(i-1) == 'X')
                ans -= 20;

            if(i > 0 && s.charAt(i) == 'D' && s.charAt(i-1) == 'C' || i > 0 && s.charAt(i) == 'M' && s.charAt(i-1) == 'C')
                ans -= 200;
            
            
            ans += hm.get(s.charAt(i));
            //System.out.println(ans);
        }
        return ans;
    }
}
