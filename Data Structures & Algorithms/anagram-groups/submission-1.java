class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String newString=new String(ch);
            if(!map.containsKey(newString)) map.put(newString,new ArrayList<>());
            map.get(newString).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
