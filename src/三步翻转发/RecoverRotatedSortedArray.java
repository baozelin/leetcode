package 三步翻转发;

import java.util.List;

//[4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]


public class RecoverRotatedSortedArray {
	public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        
        //3步翻转  
        //用reverse
        //[4,5| 1,2,3]->[5,4| 3,2,1]->[1,2,3,4,5]
        
        
        for(int index = 0; index < nums.size() -1; index++){
            if(nums.get(index) > nums.get(index +1)){
                reverse(nums, 0, index);
                reverse(nums, index +1, nums.size() -1);
                reverse(nums, 0, nums.size() -1);
                return;
            }
        }
    }
        //reverse
        
    public void reverse(List<Integer>nums, int start, int end){
        for(int i = start, j = end; i < j; i++, j--){
            int tmp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j, tmp);
        }
    }
}
