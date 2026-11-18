class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return bstTree(nums,0,nums.length-1);
    }
    public TreeNode bstTree(int[] nums,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode tree=new TreeNode(nums[mid]);
        tree.left=bstTree(nums,start,mid-1);
        tree.right=bstTree(nums,mid+1,end);
        return tree;
    }
}
