package 双指针;

import java.util.Arrays;
/*
 * 思路，for loop c, a +b > c 都是, b--; a+b<c a++;
 */
public class TriangleCount {
public int triangleCount(int[] S) {
        if(S == null || S.length < 3) return  0;
        Arrays.sort(S);     
        //set c, then find a, b
        int count = 0;
      
        for(int i = 2; i < S.length; i++){
      
            int target = S[i];
     
            // two sum;
            int left = 0, right = i - 1;
          
            while(left < right){
              
                if(left < right && S[left] + S[right] > target ){
                    count += right - left;
                    right--;
                }else
                    left++;
            }  
        }
      return count;
    }
}
