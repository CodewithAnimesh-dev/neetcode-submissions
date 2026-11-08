class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int sp = 0;
        int tp = 0;
        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
                tp++;
            }
            else tp++;
        }
        if(sp == s.length()) return true;
        else return false;
    }
}