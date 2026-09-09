class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=heights.length;i++){
            int currHeight=(i==heights.length)?0:heights[i];
            while(!stk.isEmpty() && currHeight<heights[stk.peek()]){
                int height=heights[stk.pop()];
                int width;
                if(stk.isEmpty()){
                    width=i;
                }
                else{
                    width=i-stk.peek()-1;
                }
                int area=height*width;
                maxArea=Math.max(maxArea,area);
            }
            stk.push(i);
        }
        return maxArea;
    }
}