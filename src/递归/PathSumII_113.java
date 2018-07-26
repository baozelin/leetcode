package 递归;

import java.util.ArrayList;
import java.util.List;



public class PathSumII_113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        if(root == null) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        
        sum(root, sum, list, ret);
        return ret;
    }
    
    private void sum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> ret){
   
        if(root != null){     
            list.add(root.val);
            if(root.left == null && root.right == null && root.val == sum ){
            
                ret.add(new ArrayList<>(list));
            }

            int tmp = sum - root.val;
            
            sum(root.left, tmp, list, ret);
            sum(root.right, tmp, list, ret);
            
            list.remove(list.size()-1);
        }   
    }
    private class TreeNode {
	   	 int val;
	   	 TreeNode left;
	   	 TreeNode right;
	   	 TreeNode(int x) { val = x; }
	}
}

