package 双指针;

public class MergeSortedArray_88 {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] tmp = new int[m];
	        for(int i = 0; i < m; i++){
	            tmp[i] = nums1[i];
	        }
	        int i = 0, j = 0,index = 0;
	        while(i < m || j < n){
	            if(i > m - 1){ 
	                nums1[index] = nums2[j++];
	            }
	            else if(j > n - 1 ){
	                nums1[index] = tmp[i++];
	            }
	            else{
	                if(tmp[i] < nums2[j]){
	                    nums1[index] = tmp[i];
	                    i++;
	                }
	                else{
	                    nums1[index] = nums2[j];
	                    j++;
	                }
	            }
	            index++;
	        }
	    }
	 /**
	  * 反过来添加
	  * @param nums1
	  * @param m
	  * @param nums2
	  * @param n
	  */
	 public void merge2(int[] nums1, int m, int[] nums2, int n) {
		    int i = m - 1, j = n - 1; // 需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值
		    int index = m + n - 1;
		    while (i >= 0 || j >= 0) {
		        if (i < 0) nums1[index] = nums2[j--];
		        else if (j < 0) nums1[index] = nums1[i--];
		        else if (nums1[i] > nums2[j]) nums1[index] = nums1[i--];
		        else nums1[index] = nums2[j--];
		        index--;
		    }
		}
}
