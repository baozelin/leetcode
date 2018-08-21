package other;



class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        int index = 0;
        
        for(int i = 1; i< nums.length; i++){
           
            if(nums[i] != nums[index]){
                index = index + 1;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}