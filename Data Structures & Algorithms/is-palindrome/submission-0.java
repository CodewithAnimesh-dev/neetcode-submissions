class Solution {
    public boolean isPalindrome(String s) {
        String c="";
                for(int i=0;i<s.length();i++){
                            char ch=s.charAt(i);
                                        if(Character.isLetterOrDigit(ch)){
                                                        c+=Character.toLowerCase(ch);
                                                                    }
                                                                            }
                                                                                    int n=c.length();
                                                                                            for(int i=0;i<n/2;i++){
                                                                                                        if(c.charAt(i)!=c.charAt(n-1-i)){
                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                            }
                                                                                                                                                    return true;
    }
}
