package 双指针;

import java.util.HashMap;

public class TwoSumII_167 {
	/**
	 * method 1: using hashmap
	 * @param numbers
	 * @param target
	 * @return
	 */
    public int[] twoSum1(int[] numbers, int target) {
        HashMap<Integer, Integer> cmp = new HashMap<Integer, Integer>();    
        if (numbers == null || numbers.length < 2) return null; 
 
        for(int i = 0; i < numbers.length; i++){
            cmp.put(target - numbers[i], i);
        }      
        for(int i = 0; i < numbers.length; i++){
           if( cmp.containsKey(numbers[i])){
               int[] ret = new int[2];
               ret[0] = i + 1;
               ret[1] = cmp.get(numbers[i]) +1 ;      
               return ret;
           }
        }     
        return null;
    }
    /**
     * method 2 using two points
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
       
        while(left < right){
        int sum = numbers[left] + numbers[right];
            if(sum == target) return new int[]{left+1,right+1};
            else if(sum < target) left++;
            else right--;
        }
        
        return null;
    }
}
    
