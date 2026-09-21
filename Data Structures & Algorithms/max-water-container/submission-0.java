class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int Ma=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(heights[left],heights[right]);
            int area=width*h;
            Ma=Math.max(Ma,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return Ma;
        
    }
}
