class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int maxlength=0;
        int lp=0;
        for(int rp=0;rp<s.length();rp++){
            while(set.contains(s.charAt(rp))){
                set.remove(s.charAt(lp));
                lp++;
            }
            set.add(s.charAt(rp));
            int currlength=rp-lp+1;
            maxlength=Math.max(maxlength,currlength);
        }
        return maxlength;
    }
}
