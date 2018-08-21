package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {
	private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || target == 0) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        
        backtracking(list, candidates, 0, target);
        return ret;
    }
    
    public void backtracking(List<Integer> list, int[] candidates, int sum, int target){
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
            list.add(num);
            sum += num;
            backtracking(list, candidates, sum, target);
            list.remove(list.size() - 1);
            sum -= num;
        }
    }	
    
    public static void main(String[]arg) {
    	CombinationSum_39 t = new CombinationSum_39();
    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
    	int[] in = new int[] {8,7,4,3};
    	tmp = t.combinationSum(in, 11);
    	System.out.println("list:");
    	System.out.println(tmp.size());
    	for(int i = 0; i < tmp.size(); i++){
    		//System.out.println("list:11");
    		System.out.println(tmp.get(i));
    	}
    }
}

