package 排序;

import java.util.Arrays;
import java.util.PriorityQueue;

public class sdfsdf {
	/**
	 * 快速排序  使用于找kth element
	 */
	public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
	
	/**
	 * 堆排序用于求解 TopK Elements 问题，通过维护一个大小为 K 的堆，堆中的元素就是 TopK Elements
	 */
	
	public int findKthLargest2(int[] nums, int k) {
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    for (int val : nums) {
	        pq.add(val);
	        if (pq.size() > k) {
	            pq.poll();
	        }
	    }
	    return pq.peek();
	}
}
