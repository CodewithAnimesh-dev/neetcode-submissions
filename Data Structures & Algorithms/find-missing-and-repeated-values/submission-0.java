class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length;
        int length=n*n;
        int totalsum=length*(length+1)/2;
        int currsum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])) ans[0]=grid[i][j];
                else{
                    set.add(grid[i][j]);
                    currsum+=grid[i][j];
                }
            }
        }
        int missnum=totalsum-currsum;
        ans[1]=missnum;
        return ans;
    }
}