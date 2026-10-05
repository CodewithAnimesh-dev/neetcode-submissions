class Solution {
        public int largestRectangleArea(int[] heights) {
                int[] left=new int[heights.length];
                        int[] right=new int[heights.length];
                                Stack<Integer> s=new Stack<>();
                                        for(int i=heights.length-1;i>=0;i--){
                                                    while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                                                                    s.pop();
                                                                                }
                                                                                            right[i]=s.isEmpty()? heights.length:s.peek();
                                                                                                        s.push(i);
                                                                                                                }
                                                                                                                        s.clear();
                                                                                                                                for(int i=0;i<heights.length;i++){
                                                                                                                                            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                                                                                                                                                            s.pop();
                                                                                                                                                                        }
                                                                                                                                                                                    left[i]=s.isEmpty()? -1:s.peek();
                                                                                                                                                                                                s.push(i);
                                                                                                                                                                                                        }
                                                                                                                                                                                                                int maxarea=0;
                                                                                                                                                                                                                        for(int i=0;i<heights.length;i++){
                                                                                                                                                                                                                                    int width=right[i]-left[i]-1;
                                                                                                                                                                                                                                                int area=heights[i]*width;
                                                                                                                                                                                                                                                            maxarea=Math.max(maxarea,area);
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                            return maxarea;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }

