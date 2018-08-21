package other;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        if(nums.length == 1 && nums[0] != val) return 1;
        if(nums.length == 1 && nums[0] == val) return 0;
        
        //Array.Sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
}
}