class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str+=Character.toLowerCase(ch);
            }
        }
        int lp=0,rp=str.length()-1;
        while(lp<rp){
            if(str.charAt(lp)!=str.charAt(rp)) return false;
            lp++;
            rp--;
        }
        return true;
    }
}
