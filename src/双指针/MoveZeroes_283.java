package 双指针;

public class MoveZeroes_283 {
	
public void moveZeroes(int[] nums) {
        
        // // 用双指针
        /*
        move 往下， zero 记录当前0，换值后再zero++；
        */
      int zero = 0, move = 0;
        
        while(move < nums.length){
            if(nums[move] != 0){
                int tmp = nums[move];
                nums[move] = nums[zero];
                nums[zero] = tmp;
                zero++;
            }
            move++;
        }
    }
}
