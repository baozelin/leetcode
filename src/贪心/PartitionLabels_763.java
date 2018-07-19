package 贪心;

import java.util.ArrayList;
import java.util.List;


public class PartitionLabels_763 {
	public List partitionLabels(String S) {
	    List ret = new ArrayList<>();
	    int[] lastIndexs = new int[26];
	    for (int i = 0; i < S.length(); i++) {
	        lastIndexs[S.charAt(i) - 'a'] = i;
	    }
	    int firstIndex = 0;
	    while (firstIndex < S.length()) {
	        int lastIndex = firstIndex;
	        for (int i = firstIndex; i < S.length() && i <= lastIndex; i++) {
	            int index = lastIndexs[S.charAt(i) - 'a'];
	            if (index == i) continue;
	            if (index > lastIndex) lastIndex = index;
	        }
	        ret.add(lastIndex - firstIndex + 1);
	        firstIndex = lastIndex + 1;
	    }
	    return ret;
	}
	 public static void main(String[]arg) {
		 PartitionLabels_763 t = new PartitionLabels_763();
		 String S = "ababcbacadefegdehijhklij";
		 t.partitionLabels(S);
		 System.out.println('c'-'a');
	 }
}