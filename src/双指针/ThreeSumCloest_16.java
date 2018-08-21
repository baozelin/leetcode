package 双指针;

import java.util.Arrays;

/*
 * 思路
 * threeSUM + MATH.MIN
 * 先定a， 做b，c的twosum
 */
public class ThreeSumCloest_16 {
	public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        //if(numbers == null || numbers.length == 0) return 0;
        
        Arrays.sort(numbers);
        
        int diff = Integer.MAX_VALUE;
        int ret = 0;
        
        // first set a;
        for(int i = 0; i < numbers.length; i++){
            
            int first = numbers[i];
            
            int left = i +1, right = numbers.length-1;
            
            while(left < right){
                if(first + numbers[left] + numbers[right] < target){
                    if(diff > target - first - numbers[left] -numbers[right]){
                        
                    ret = first + numbers[left] + numbers[right];
                    diff = target - first - numbers[left] -numbers[right];
                    
                    }
                    
                    left++; 
                }else{
                    if(diff > first + numbers[left] + numbers[right] - target ){
                        ret = first + numbers[left] + numbers[right];
                        diff = first + numbers[left] + numbers[right] - target;
                    }
                    
                    right--; 
                }
            }
        }
        return ret;
    }
}
