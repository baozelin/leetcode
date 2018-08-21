package 双指针;

import java.util.Arrays;
import java.util.HashMap;

/*
 * G家的一个相似问题：找到一个数组中有多少对二元组，他们的平方差 < target（target 为正整数）。
我们可以用类似放的方法来解决，首先将数组的每个数进行平方，那么问题就变成了有多少对两数之差 < target。
然后走一遍上面的这个流程，当找到一对 nums[j] - nums[i] >= target 的时候，就相当于一口气发现了：
 */
public class twosum_G {

	public int two(int[] nums, int target) {
		 if(nums == null || nums.length < 2) return 0;
		 int count = 0;
		 
		 for(int i = 0; i < nums.length; i++) {
			 nums[i] = nums[i] * nums[i];
		 }
		
		 Arrays.sort(nums);
		 
		 int j = 0;
		 for(int i = 0; i < nums.length; i++) {
			 //while (j)
		 }
		 
		 return count;
	}		
}
