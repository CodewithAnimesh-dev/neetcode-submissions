class Solution {
    public void sortColors(int[] nums) {
        int start=0,mid=0,last=nums.length-1;
        while(mid<=last){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[start];
                nums[start]=temp;
                start++;
                mid++;
            }else if(nums[mid]==1) mid++;
            else{
                int temp=nums[mid];
                nums[mid]=nums[last];
                nums[last]=temp;
                last--;
            }
        }
    }
}