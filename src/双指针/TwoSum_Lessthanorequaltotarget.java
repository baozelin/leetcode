package 双指针;

import java.util.Arrays;

public class TwoSum_Lessthanorequaltotarget {
	public int twoSum5(int[] nums, int target) {
        // write your code here
        if(nums == null || nums.length == 0) return 0;
        
        //if( target < 0) target = -target;
        Arrays.sort(nums);
        
        int count = 0;
        int left = 0, right = nums.length -1;
        
        while(left < right){
            if(left < right && nums[left] + nums[right] <= target){
                count += right - left;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
