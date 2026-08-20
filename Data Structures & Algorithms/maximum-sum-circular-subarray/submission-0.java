class Solution {
    public int sum(int[] nums){
        int sumAns=0;
        for(int i=0;i<nums.length;i++){
            sumAns+=nums[i];
        }
        return sumAns;
    }
    public int kadanesmin(int[] nums){
        int minsum=Integer.MAX_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            minsum=Math.min(minsum,currsum);
            if(currsum>0) currsum=0;
        }
        return minsum;
    }
    public int kadanesmax(int[] nums){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0) currsum=0;
        }
        return maxsum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=sum(nums);
        int minsum=kadanesmin(nums);
        int maxsum=kadanesmax(nums);
        int circularsum=totalsum-minsum;
        if(maxsum>0) return Math.max(maxsum,circularsum);
        else return maxsum;
    }
}