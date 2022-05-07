package main.java.com.haijiao12138.demo.leetcode.code2022.day_0507;

/**
 * @Author:候苑博
 * @Date:2022-05-07 19:44
 * description: 递归求解
 * Todo:
 */
public class 力扣124_二叉树中的最大路径和_困难 {
    private int ret = Integer.MIN_VALUE;//定义最小的
    public static void main(String[] args) {

    }

    public int maxPathSum(TreeNode root) {

        getMax(root);
        return ret;
    }

    private int getMax(TreeNode r){
        if(r == null){
            return 0;
        }
        int left = Math.max(0,getMax(r.left));//如果左路径和为负数  那么选0作为当前的最大路径和
        int right = Math.max(0,getMax(r.right));
        ret = Math.max(ret,r.val+left+right);//判断该节点的左右路径和和当前的路径和的最大值的大小；
        return Math.max(left,right)+r.val;

    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
