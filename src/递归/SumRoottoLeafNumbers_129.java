package 递归;

import java.util.ArrayList;
import java.util.List;

public class  SumRoottoLeafNumbers_129 {
	
	/**
	 * 
	 * 自己写的dfs 慢
	 * 
	 */
	
	 int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        dfs(root, list, ret);
        
        int sum = 0;
        for(int i = 0; i < ret.size(); i++){
            int tmp = 0;
            for(int j = 0; j < ret.get(i).size(); j++){
                tmp = tmp *10 + ret.get(i).get(j);
            }
            sum = sum + tmp;
        }
        return sum;
    }
    
    void dfs(TreeNode root, List<Integer> list, List<List<Integer>> ret){
        if(root == null) return;
        
        list.add(root.val);
        
        if(root.left == null && root.right == null) {
            ret.add(new ArrayList<>(list));
        }
        
        dfs(root.left, list, ret);
        dfs(root.right, list, ret);
        list.remove(list.size()-1);
    }
    
    
    /**
     * 
     * 学习版dfs
     */
    
    int sum , res;
    int sumNumbers2(TreeNode root) {
    	if(root == null) return 0;
    	sum = res =0;
    	dfs2(root);
    	return res;
    }
    
    void dfs2(TreeNode root) {
    	if(root == null) return;
    	sum = sum *10 + root.val;
    	if(root.left == null && root.right == null) {
    		res = res + sum;
    	}
    	if(root.left != null) dfs2(root.left);
    	if(root.right != null) dfs2(root.right);
    	sum = (sum - root.val)/ 10;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[]args) {
    	SumRoottoLeafNumbers_129 t = new SumRoottoLeafNumbers_129();
    	TreeNode tree = new TreeNode(1);
    	tree.left = new TreeNode(2);
    	tree.right = new TreeNode(3);
    	System.out.print(t.sumNumbers(tree));
    }
    

}


