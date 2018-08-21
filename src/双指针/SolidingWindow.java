package 双指针;

import java.util.ArrayList;
import java.util.List;

import backtracking.Combinations_77_bad;

/**
 * 求出一个数组每 kkk 个连续整数的和的数组。如 nums = [1,2,3,4], k = 2 的话，
 * window sum 数组为 [3,5,7].
 *
 */


public class SolidingWindow {
	
	public int[] winsum(int[] nums, int k) {
		if(nums == null) return new int[0];
		
		int[] sum = new int[nums.length - k + 1];
		
		//先算前k数和
		for(int i = 0; i < k; i++) {
			sum[0] += nums[i];
		}
		
		//依次往后移， 去第一个，加后一个
		for(int i = 1; i < sum.length; i++ ) {
			sum[i] = sum[i-1] - nums[i-1] + nums[i+k-1];
		}
		
		
		return sum;
		
	}
	
	 public static void main(String[]arg) {
		 SolidingWindow t = new SolidingWindow();
	    	//List<List<Integer>> tmp = new ArrayList<List<Integer>>();
		 //int[] tmp = new int[]
	    	//tmp = t.combine(10, 7);
	    	//System.out.println("list:");
	    	System.out.println(Math.ceil(1/3));
	    	//for(int i = 0; i < tmp.size(); i++){
	    		//System.out.println("list:11");
	    	//	System.out.println(tmp.get(i));
	    	}
 }

