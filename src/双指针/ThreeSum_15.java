package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * 做twosum 必须保证 number1是第一个duplicates, number2 是最后一个duplicates。 就是“1”，1，3，4，5，6，“6”
 */

public class ThreeSum_15 {
	
	
	public List<List<Integer>> threeSum(int[] numbers) {
        //sort numbers[] first
      List<List<Integer>> ret = new ArrayList<List<Integer>>();
      
      if(numbers == null || numbers.length < 3) return ret;
      
      Arrays.sort(numbers);
      
      //set c, then find a, b
      
      for(int i = 2; i < numbers.length; i++){
          //*** number1 倒数是first duplicates   重要！！！！！！！
          if(i + 1 < numbers.length && numbers[i] == numbers[i +1]) continue;
          
          
          int target = -numbers[i];
          
         
          // two sum;
          int left = 0, right = i - 1;
          
          for(left = 0; left <= i; left++){
          	//******number2 是第一个duplicates  重要！！！！！！！
        	  
              if(left > 0 && numbers[left] == numbers[left - 1])
                 continue;
        
              while(left < right && numbers[left] + numbers[right] > target )
                  right--;
              
              
              if(left < right && numbers[left] + numbers[right] == target){        
                  List<Integer> list = new ArrayList<Integer>();
                  
                  list.add(numbers[left]);
                  list.add(numbers[right]);
                  list.add(numbers[i]);
                  ret.add(list);                     
              }
          }  
      }
      return ret;
  }
	
	
	// want set a first ，再去找b, c
	
	 public List<List<Integer>> threeSum2(int[] numbers) {
	        
	        // write your code here
	        //sort numbers[] first
	        List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        
	        if(numbers == null || numbers.length < 3) return ret;
	        
	        Arrays.sort(numbers);
	        
	        //先for a, 在里做 two sum.
	        for(int i = 0; i < numbers.length; i++){
	            
	            //if(i +1 < numbers.length && numbers[i] == numbers[i +1]) continue;   就是改了这，因为 number1 必须是第一个duplicates
	            if(i > 0 && numbers[i] == numbers[i - 1]) continue;
	            
	            int target = -numbers[i];
	            // two sum;
	            int left =  i + 1, right = numbers.length -1;
	            
	            while(left < right){
	                if(left > 0 && numbers[left] == numbers[left -1]){
	                    left++;
	                    //i++;
	                    
	                }else{
	                    while(left < right && numbers[left] + numbers[right] > target ){
	                        right--;
	                    }
	                    
	                    if(left < right && numbers[left] + numbers[right] == target){
	                        
	                        List<Integer> list = new ArrayList<Integer>();
	                     
	                        list.add(numbers[left]);
	                        list.add(numbers[right]);
	                        list.add(numbers[i]);
	                        ret.add(new ArrayList<Integer>(list));
	                        
	                    }
	                    left++;
	                    
	                }
	            }
	            
	        }
	        return ret;
	    }
	
	
	
	
	
	
	
	public static void main(String[]arg) {
		ThreeSum_15 t = new ThreeSum_15();
	    	//List<List<Integer>> tmp = new ArrayList<List<Integer>>();
		 int[] in = new int[] {-4,-1,-1,2,3,1,0,0,2};
		 int[] tmp = new int[2];
		 System.out.println(t.threeSum(in));
	    	
	    	//for(int i = 0; i < 2; i++){
	    		
	    	//System.out.println(tmp[i]);
	    	//}
		}
}
