class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
                HashSet<Integer> set=new HashSet<>();
                        for(int i=0;i<nums.length;i++){
                                    set.add(nums[i]);
                                            }
                                                    int[] arr=new int[set.size()];
                                                            int idx=0;
                                                                    for(int num:set){
                                                                                arr[idx++]=num;
                                                                                        }
                                                                                                Arrays.sort(arr);
                                                                                                        int count=1,longest=1;
                                                                                                                for(int i=1;i<arr.length;i++){
                                                                                                                            if(arr[i]==arr[i-1]+1){
                                                                                                                                            count++;
                                                                                                                                                            longest=Math.max(longest,count);
                                                                                                                                                                        }else count=1;
                                                                                                                                                                                }
                                                                                                                                                                                        return longest;
    }
}
