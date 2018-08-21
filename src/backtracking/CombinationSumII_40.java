package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {
private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates == null || target == 0) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        boolean[] visited = new boolean[candidates.length];
        
        backtracking(list, candidates, 0, visited, target);
        return ret;
    }
    
    public void backtracking(List<Integer> list, int[] candidates, int sum, boolean[] visited, int target){
        if(sum == target){
            List<Integer> tmp = new ArrayList<Integer>(list);
            tmp.sort(null);
            if(!ret.contains(tmp)){
                ret.add(new ArrayList<Integer>(list));
            }
            return;
        }
        
        for(int i = 0; i < candidates.length && sum <= target; i++){
            int num = candidates[i];
            if(visited[i]) continue;
            list.add(num);
            sum += num;
            visited[i] = true;
            
            backtracking(list, candidates, sum, visited, target);
            list.remove(list.size() - 1);
            sum -= num;
            visited[i] = false;
        }
    }	
    
    public static void main(String[]arg) {
    	CombinationSumII_40 t = new CombinationSumII_40();
    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
    	int[] in = new int[] {10,1,2,7,6,1,5};
    	tmp = t.combinationSum2(in, 8);
    	System.out.println("list:");
    	System.out.println(tmp.size());
    	for(int i = 0; i < tmp.size(); i++){
    		//System.out.println("list:11");
    		System.out.println(tmp.get(i));
    	}
    }
}
