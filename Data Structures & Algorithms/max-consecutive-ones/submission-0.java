class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne=0,currOne=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) currOne++;
            else{
                maxOne=Math.max(currOne,maxOne);
                currOne=0;
            }
        }
        return (maxOne>currOne) ? maxOne:currOne;
    }
}