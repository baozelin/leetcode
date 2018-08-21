package other;

import java.util.ArrayList;
import java.util.List;

/**
 * 
    记up=[n]up = [\sqrt{n}]up=[n
    ​]，作为质因数k的上界, 初始化k=2k=2k=2。
    当k<=upk <= upk<=up 且 n不为1 时，执行步骤3，否则执行步骤4。
    当n被k整除时，不断整除并覆盖n，同时结果中记录k，直到n不能整出k为止。之后k自增，执行步骤2。
    当n不为1时，把n也加入结果当中，算法结束。

 * @author zelinbao
 *
 */
public class PrimeFactorization {
	public List<Integer> primeFactorization(int n) {
	    List<Integer> result = new ArrayList<>();
	    int up = (int) Math.sqrt(n);
	    
	    for (int k = 2; k <= up && n > 1; ++k) {
	        while (n % k == 0) {
	            n /= k;
	            result.add(k);
	        }
	    }
	    
	    if (n > 1) {
	        result.add(n);
	    }
	    
	    return result;
	}
}
