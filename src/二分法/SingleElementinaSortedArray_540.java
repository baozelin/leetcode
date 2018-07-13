package 二分法;

public class SingleElementinaSortedArray_540 {
	    public int singleNonDuplicate(int[] nums) {

	    if(nums.length == 1)
	        return nums[0];
	    if(nums[0] != nums[1])
	        return nums[0];
	    if(nums[nums.length-1] != nums[nums.length-2])
	        return nums[nums.length-1];

	    //Binary Search
	    int l = 0, r = nums.length-1;

	    while(l <= r)//"=" is must......
	    {
	        int mid = (l+r)/2;
	        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
	            return nums[mid];
	        if(nums[mid] == nums[mid+1])
	        {
	            if((mid-l) % 2 == 1)
	                r = mid-1;
	            else
	                l = mid+2;
	        }
	        else if(nums[mid] == nums[mid-1])
	        {
	            if((mid-l-1) % 2 == 1)
	                r = mid-2;
	            else
	                l = mid+1;
	        }
	    }
	 
	    return -1;
	}
	    public static void main(String []arg) {
	    	int[] array = new int[]{1,1,2,3,3,4,4,8,8};
	    	SingleElementinaSortedArray_540 h = new SingleElementinaSortedArray_540();
	    	System.out.print(h.singleNonDuplicate(array));
	    }
}
