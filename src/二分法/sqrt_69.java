package 二分法;

public class sqrt_69 {
	public int mySqrt(int x) {
        if(x <= 1) return x;
            
        int l =1;
        int r = x;
        
        while(l <= r){
            int mid = l + (r - l) / 2;
            int sqrt = x/mid;
            if(sqrt == mid) return sqrt;
            if(sqrt < mid) r = mid - 1;
            else l = mid + 1;
        }
        return r;
    }
}
