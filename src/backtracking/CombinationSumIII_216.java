package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII_216 {
	
    private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k == 0|| n == 0) return ret;
        
        List<Integer> list = new ArrayList<Integer>();
        
        backtracking(list, k, n, 1, 0);
        return ret;
    }
    
    
    public void backtracking(List<Integer> list, int k, int n, int start, int sum){
        if(k == 0 && sum == n){
            ret.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i= start; i <= 9 && k >= 0 && sum <= n; i++){
            list.add(i);
            sum += i;
            backtracking(list, k-1, n, i+1, sum);
            list.remove(list.size()-1);
            sum -= i;
        }
        
        
    }
    
    public static void main(String[]arg) {
    	CombinationSumIII_216 t = new CombinationSumIII_216();
    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
    	tmp = t.combinationSum3(3, 9);
    	System.out.println("list:");
    	System.out.println(tmp.size());
    	for(int i = 0; i < tmp.size(); i++){
    		//System.out.println("list:11");
    		System.out.println(tmp.get(i));
    	}
    }
}
