class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        ArrayList<int[]> result=new ArrayList<>();
        int[] newinterval=intervals[0];
        result.add(newinterval);
        for(int i=1;i<intervals.length;i++){
            int[] interval=intervals[i];
            if(interval[0]<=newinterval[1]){
                newinterval[1]=Math.max(interval[1],newinterval[1]);
            }else{
                newinterval=interval;
                result.add(newinterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}