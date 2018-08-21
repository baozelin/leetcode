package 搜索;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new  ArrayList<String>();
		if(root == null) return list;
		dfs(root, "", list);
		return null;
}
	private void dfs(TreeNode root, String pre, List<String> list) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			list.add(pre + root.val);
			return;
		}
		pre = pre + root.val + "->";
		dfs(root.left, pre, list);
		dfs(root.right, pre, list);
	}
	private class TreeNode {
	   	 int val;
	   	 TreeNode left;
	   	 TreeNode right;
	   	 TreeNode(int x) { val = x; }
	
	}
}