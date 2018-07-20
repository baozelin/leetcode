package 搜索;

import java.util.ArrayList;
import java.util.Arrays;

import 排序.SortCharactersByFrequency_451;

public class SubsetsII_90 {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
	       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	       ArrayList<Integer> tmp = new ArrayList<Integer>();
	       Arrays.sort(num);
	       res.add(tmp);
	       dfs(res,tmp,num,0);
	       return res;
	    }
	    
	    public void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int[] num, int pos){
	        for(int i=pos;i<=num.length-1;i++){
	            tmp.add(num[i]);
	            res.add(new ArrayList<Integer>(tmp));
	            dfs(res,tmp,num,i+1);
	            tmp.remove(tmp.size()-1);
	            while(i<num.length-1 && num[i]==num[i+1]) i++;  
	        }
	    }
	    public static void main(String[]arg) {
	    	SubsetsII_90 t = new SubsetsII_90();
			 int[] S = new int[] {1,2,2};
			 t.subsetsWithDup(S);
		 }
}
