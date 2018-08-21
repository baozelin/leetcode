package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII_47 {
	
List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums == null) return ret;
        List<Integer> list = new ArrayList<Integer>();
        
        //Array.sort(nums);
        boolean[] visited = new boolean[nums.length];
        
        dfs(list, visited, nums, 0);
        return ret;
    }
    
    private void dfs(List<Integer> list,boolean[] visited, int[] nums, int pos){
        if(pos == nums.length) {
            
            List<Integer> tmp = new ArrayList<Integer>(list);
            if(!ret.contains(tmp)){
            ret.add(tmp);
            return;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            
            int num = nums[i];
            if(visited[i]) continue;
            
            list.add(num);
            visited[i] = true;
            
            dfs(list,visited, nums, pos+1);
            list.remove(list.size()-1);
            visited[i] = false;
        }
        
        
    }
}

