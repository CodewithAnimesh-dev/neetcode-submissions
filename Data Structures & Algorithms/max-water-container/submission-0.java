class Solution {
    public int maxArea(int[] heights) {
        int lp=0,rp=heights.length-1,maxwater=0;
        while(lp<rp){
            int height=Math.min(heights[lp],heights[rp]);
            int width=rp-lp;
            int currwater=height*width;
            maxwater=Math.max(maxwater, currwater);
            if(heights[lp]<heights[rp]) lp++;
            else rp--;
        }
        return maxwater;
    }
}
