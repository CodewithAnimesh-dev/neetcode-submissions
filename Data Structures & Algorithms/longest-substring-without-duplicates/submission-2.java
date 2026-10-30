class Solution {
        public int lengthOfLongestSubstring(String s) {
                Set<Character>charset=new HashSet<>();
                        int maxlength=0;
                                int lp=0;
                                        for(int rp=0;rp<s.length();rp++){
                                                    while(charset.contains(s.charAt(rp))){
                                                                    charset.remove(s.charAt(lp));
                                                                                    lp++;
                                                                                                }
                                                                                                            charset.add(s.charAt(rp));
                                                                                                                        maxlength=Math.max(maxlength,rp-lp+1);
                                                                                                                                }
                                                                                                                                        return maxlength;
                                                                                                                                            }
                                                                                                                                            }
