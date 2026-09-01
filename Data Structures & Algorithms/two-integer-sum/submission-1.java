class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currsum=target-nums[i];
            if(map.containsKey(currsum)) return new int[]{map.get(currsum),i};
            else map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
