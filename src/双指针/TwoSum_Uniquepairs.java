package 双指针;

import java.util.Arrays;

public class TwoSum_Uniquepairs {
	public int twoSum6(int[] nums, int target) {
        // write your code here
        
        
        // 跳过一样的， 如1，1 ->去重
        Arrays.sort(nums);
        int left = 0; int right = nums.length -1;
        int count = 0;
        
        while(left < right){
            if(left > 0 && nums[left] == nums[left -1]) left++; 
        
            else {
            	while(left < right && nums[right] > target - nums[left]) right--;
            
            	if(left < right && nums[left] + nums[right] == target){
            		count++;
            	}
            }
            left++;
        }
        return count;
    }
	
	
	
	//jiu zhang
	
	public int twoSum62(int[] A, int T) {
        if (A == null || A.length <= 1) {
            return 0;
        }
        
        Arrays.sort(A);
        int i, n = A.length;
        int j = n - 1;
        int res = 0;
        
        for (i = 0; i < n; ++i) {
            // item1 should be the first among its duplicates
            if (i > 0 && A[i] == A[i - 1]) {
                continue;
            }
            
            // item2 should be the last among its duplicates
            while (j > i && A[j] > T - A[i]) {
                --j;
            }
            
            // this is to avoid that i==j, A[i]+A[j]=T, which does not count
            if (j > i && A[j] == T - A[i]) {
                ++res;
            }
        }
        
        return res;
    }
	
	

	public static void main(String[]arg) {
	TwoSum_Uniquepairs t = new TwoSum_Uniquepairs();
    	//List<List<Integer>> tmp = new ArrayList<List<Integer>>();
	 int[] in = new int[] {1,1,2,45,46,46};
	 int[] tmp = new int[2];
	 System.out.println(t.twoSum6(in, 47));
    	
    	//for(int i = 0; i < 2; i++){
    		
    	//System.out.println(tmp[i]);
    	//}
	}
	
}
