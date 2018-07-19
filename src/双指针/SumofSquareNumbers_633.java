package 双指针;

public class SumofSquareNumbers_633 {
	public boolean judgeSquareSum(int c) {
        int l = 0, r = (int)Math.sqrt(c);
        
        while(l <= r){
            if(l*l + r*r == c) return true;
            else if(l*l + r*r < c) l++;
            else r--;
        }
        return false;
    }
}
