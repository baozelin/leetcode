package 贪心;
import java.util.Arrays;
import java.util.Comparator;

import 二分法.SingleElementinaSortedArray_540;

public class MinimumNumberofArrowstoBurstBalloons_452 {
	
	class Solution {
	    public int findMinArrowShots(int[][] points) {
	        if(points == null || points.length == 0 || points[0].length == 0) return 0;
	        
	        Arrays.sort(points, new Comparator<int[]>(){
	           public int compare (int[] a, int[] b ){
	               return a[1] - b[1];
	           } 
	        });
	        
	        long end = Long.MIN_VALUE;
	        int arrow = 0;
	        
	        for(int i = 0; i < points.length; i++){
	            if(end < points[i][0]){
	                end = points[i][1];
	                arrow++;
	            }
	        }
	        return arrow;
	    }
	}
	public static void main(String []arg) {
    	
    	MinimumNumberofArrowstoBurstBalloons_452 h = new MinimumNumberofArrowstoBurstBalloons_452();
	}
}

