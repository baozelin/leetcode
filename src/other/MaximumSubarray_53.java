package other;

public class MaximumSubarray_53 {
	
	/**
	 * 一次循环， 如果加到负数，就不要前面的了，从这继续开始往后
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
        int max = nums[0];
        int tmp = 0;
        for(int i = 0; i < nums.length; i++){
            tmp = tmp + nums[i];
            if(tmp > max) max = tmp;
            
            if(tmp < 0) tmp =0;
            
        }
        return max;
    }
}
