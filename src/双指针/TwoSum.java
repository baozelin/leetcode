package 双指针;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
	
	/**
	 * hashmap
	 */
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                int[] res = new int[2];
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
           map.put(nums[i], i);
        }
        return null;
    }
	
	// 双指针 解法
	
	class Pair {
	    public int index, num;
	    public Pair(int i, int n) {
	        this.index = i;
	        this.num = n;
	    }
	}
	
	public int[] twoSum2(int[] nums, int target) {
		int[] ret = new int[2];
		if(nums == null || nums.length < 2) return ret;
		
		//建立 pair
		
		Pair[] pairs = new Pair[nums.length];
		for(int i =0; i < nums.length; i++) {
			pairs[i] = new Pair(i, nums[i]);
		}
		Arrays.sort(pairs, new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p1.num - p2.num;
			}
		});
		
		int l = 0, r = pairs.length - 1;
		while(l < r) {
			if(pairs[l].num + pairs[r].num == target) {
				ret[0] = pairs[l].index +1;
				ret[1] = pairs[r].index+1;
				
				if(ret[0] > ret[1]) {
					int tmp = ret[0];
					ret[0] = ret[1];
					ret[1] = tmp;
				}
				return ret;
			}
			if(pairs[l].num + pairs[r].num < target)
                l++;
            else r--;
		}
		return ret;
	}
	public static void main(String[]arg) {
		TwoSum t = new TwoSum();
	    	//List<List<Integer>> tmp = new ArrayList<List<Integer>>();
		 int[] in = new int[] {2,7,11,15};
		 int[] tmp = new int[2];
	    	tmp = t.twoSum2(in, 9);
	    	
	    	for(int i = 0; i < 2; i++){
	    		
	    	System.out.println(tmp[i]);
	    	}
	}
	/*
	 * 
	 * Arrays.sort(nums);
        
        int l = 0, r = nums.length - 1;
        while(l <= r){
            if(nums[l] + nums[r] == target){
                int[] res = new int[2];
                res[0] = l;
                res[1] = r;
                return res;
            }
            
            if(nums[l] + nums[r] < target){
                l++;
            }
            
            if(nums[l] + nums[r] > target){
                r--;
            }
        }
        return null;
    }
	 */
	
}
