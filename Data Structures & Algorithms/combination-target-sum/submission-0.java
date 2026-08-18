class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         Arrays.sort(candidates);
         Set<List<Integer>> set=new HashSet<>();
         List<Integer> combination=new ArrayList<>();
         getallcombination(candidates,0,combination,set,target);
         return new ArrayList<>(set);
    }
    public void getallcombination(int[] candidates,int i,List<Integer> combination,Set<List<Integer>> set,int target){
        if(i==candidates.length || target<0) return;
        if(target==0){
            set.add(new ArrayList<>(combination));
            return;
        }
        combination.add(candidates[i]);
        getallcombination(candidates,i+1,combination,set,target-candidates[i]);
        getallcombination(candidates,i,combination,set,target-candidates[i]);
        combination.remove(combination.size()-1);
        getallcombination(candidates,i+1,combination,set,target);
    }
}