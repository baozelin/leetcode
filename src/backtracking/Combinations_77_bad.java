package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations_77_bad {
	
	 private List<List<Integer>> ret = new ArrayList<List<Integer>>();
	    
	    public List<List<Integer>> combine(int n, int k) {
	        
	        if(n <= 0) return ret;
	        if(n == 1) {
	            List<Integer> tmp = new ArrayList<Integer>();
	            tmp.add(n);
	            ret.add(new ArrayList<Integer>(tmp));
	            return ret;
	        }
	        
	        List<Integer> list = new ArrayList<Integer>();
	        int[] nums = new int[n];
	        
	        for(int i = 1; i <= n; i++){
	            nums[i-1] = i;
	        }
	        
	        //boolean[] visited = new boolean[nums.length];
	        
	        dfs(nums, list, 0, k, n);
	        return ret;
	    }
	    
	    public void dfs(int[] nums, List<Integer> list, int pos, int k, int n){
	       if(pos == k){
	           List<Integer> tmp = new ArrayList<Integer>(list);
	           
	           //List<Integer> tmp2 = new ArrayList<Integer>();
	           tmp.sort(null);
	           if(!ret.contains(tmp)) {
	           
	           ret.add(new ArrayList<Integer>(list));
	           return;
	           }
	       } 
	        
	        for(int i = 0; i < n; i++){
	            int num = nums[i];
	            if(list.contains(num)) continue;
	            
	            list.add(num);
	            //visited[i] = true;
	            dfs(nums, list, pos+1, k, n);
	            
	            list.remove(list.size() -1);
	            //visited[i] = false;
	        }
	        
	        
	    }
        

    
    public static void main(String[]arg) {
    	Combinations_77_bad t = new Combinations_77_bad();
    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
    	tmp = t.combine(10, 7);
    	System.out.println("list:");
    	System.out.println(tmp.size());
    	for(int i = 0; i < tmp.size(); i++){
    		//System.out.println("list:11");
    		System.out.println(tmp.get(i));
    	}
    }
}
