package 三步翻转发;


//Given a string and an offset, rotate string by offset. (rotate from left to right)
//Given "abcdefg".

//offset=0 => "abcdefg"
//offset=1 => "gabcdef"
//offset=2 => "fgabcde"
//offset=3 => "efgabcd"
//Rotate in-place with O(1) extra memory.

public class RotateArray_189 {

    //3步翻转  
        //用reverse
        //[4,5| 1,2,3]->[5,4| 3,2,1]->[1,2,3,4,5]
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length -1);
        reverse(nums, 0, nums.length -1);
        return;
    }
    
    
    void reverse(int[] nums, int start, int end){
        for(int i = start, j = end; i < j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
