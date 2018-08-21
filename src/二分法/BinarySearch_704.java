package 二分法;


/*
 * 经典递归二分法
 */
class BinarySearch_704 {
	 public int search(int[] nums, int target) {
         
	        return binarySearch(nums, 0, nums.length-1, target);
	        
	    }
	    
	    
	    int binarySearch(int[] nums, int start, int end, int target){
	        
	        
	        if(start > end) return -1;
	        
	        int mid = (start+ end)/2;
	        
	        if(nums[mid] == target) return mid;
	        
	        if(nums[mid] < target) return binarySearch(nums, mid+1,end,target);
	        
	        else return binarySearch(nums, start, mid-1, target);
	    }
	    
}
