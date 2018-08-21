package 双指针;

import java.util.Arrays;

/*	思想
 *  two sum 解法 + math.math(diff, target - i - j);
 */
public class TwoSumClosest {
	public int twoSumClosest(int[] nums, int target) {        
        Arrays.sort(nums);
        
        int left = 0, right = nums.length -1;
        int diff = Integer.MAX_VALUE;
        
        while(left < right){
            if(nums[left] + nums[right] < target){
                diff = Math.min(diff, target - nums[left] - nums[right]);
                left++;
            }else{
                diff = Math.min(diff, nums[left] + nums[right] - target);
                right--;
            }
        }
        return diff;
    }
}
