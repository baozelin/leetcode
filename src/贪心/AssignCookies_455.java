package 贪心;
import java.util.Arrays;


/**
 * 
 * 贪心思想保证每次操作都是局部最优的，并且最后得到的结果是全局最优的。
 *
 */

public class AssignCookies_455 {

	public int findContentChildren(int[] g, int[] s) {
	    Arrays.sort(g);
	    Arrays.sort(s);
	    int i = 0, j = 0;
	    while(i < g.length && j < s.length){
	        if(g[i] <= s[j]) i++;
	        j++;
	    }
	    return i;
	}
}
