package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77_fast {
private List<List<Integer>> ret = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combine(int n, int k) {
    
        List<Integer> list = new ArrayList<Integer>();
       
        dfs(list, 1, k, n);
        return ret;
    }
    
    public void dfs(List<Integer> list, int start, int k, int n){
       if(0 == k){
           ret.add(new ArrayList<Integer>(list));
           return;           
       } 
        
        for(int i = start; i <= n - k + 1; i++){
         
            list.add(i);
         
            dfs(list, i+1, k - 1, n);
            
            list.remove(list.size() -1);
        }
        
        
    }
    
    public static void main(String[]arg) {
    	Combinations_77_fast t = new Combinations_77_fast();
    	List<List<Integer>> tmp = new ArrayList<List<Integer>>();
    	tmp = t.combine(4, 2);
    	System.out.println("list:");
    	System.out.println(tmp.size());
    	for(int i = 0; i < tmp.size(); i++){
    		//System.out.println("list:11");
    		System.out.println(tmp.get(i));
    	}
    }
}
