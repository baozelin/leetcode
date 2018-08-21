package 双指针;

import java.util.Arrays;
import java.util.Comparator;

//Given nums = [2, 7, 15, 24], target = 5
//return [1, 2] (7 - 2 = 5)


import java.util.HashMap;

public class twosum_difference {
	
	
	// hashmap 解法
	
	public int[] twoSum7(int[] nums, int target) {
        // write your code here
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        
        
        for(int i = 0; i < nums.length; i++){
            
            // [7, 2], 5 类型
            if(map.containsKey(target + nums[i])){
                int[] ret = new int[2];
                ret[1] = i + 1 ;
                ret[0] = map.get(target + nums[i]) + 1;
                return ret;
            }
            
            //[2,7 ] 5 这类
            if(map.containsKey(nums[i] - target)){
                int[] ret = new int[2];
                ret[1] = i + 1 ;
                ret[0] = map.get(nums[i] - target) + 1;
                return ret;
            }
            map.put(nums[i], i);
        }        
        return null;
	}
	
	// 双指针 解法
	
	public int[] twoSum72(int[] nums, int target) {
        // write your code here
        int[] ret = new int[2];
        if(nums == null || nums.length < 2) return ret;
        
        
        if (target < 0)
            target = -target;
    
        Pair[] pairs = new Pair[nums.length];
    
        for(int i = 0; i < nums.length; i++){
            pairs[i] = new Pair(i, nums[i]);
        }
    
        Arrays.sort(pairs, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p1.num - p2.num;
            }
        });
        
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if (i == j)
                j ++;
            while(j < nums.length && pairs[j].num - pairs[i].num < target)
                j++;
            
            if(j < nums.length && pairs[j].num - pairs[i].num == target){
                ret[0] = pairs[j].index + 1;
                ret[1] = pairs[i].index + 1;
                
                if(ret[0] > ret[1]){
                    int tmp = ret[0];
                    ret[0] = ret[1];
                    ret[1] = tmp;
                }
                
                return ret;
            }
        }
        return ret;
    }   
	
	
	class Pair {
        public int index, num;
        public Pair(int i, int n){
            this.index = i;
            this.num = n;
        }
    }
	
	
	public static void main(String[]arg) {
		twosum_difference t = new twosum_difference();
		int[] in = new int[] {2,7,15,24};
		in = t.twoSum7(in, 7);
		for(int i = 0; i < 2; i++){
    		//System.out.println("list:11");
    	System.out.println(in[i]);
		
	    	//List<List<Integer>> tmp = new ArrayList<List<Integer>>();
		 //int[] tmp = new int[]
	    	//tmp = t.combine(10, 7);
	    	//System.out.println("list:");
	    	//System.out.println(Math.ceil(1/3));
	    	//for(int i = 0; i < tmp.size(); i++){
	    		//System.out.println("list:11");
	    	//	System.out.println(tmp.get(i));
	    	}

	}
}
