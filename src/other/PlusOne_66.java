package other;

public class PlusOne_66 {
	public int[] plusOne(int[] digits) {
        int d = 1;
                                
        for(int i = digits.length - 1; i >=0 ; i--){
            int tmp = digits[i] + d;
            digits[i] = tmp % 10;
            d = tmp / 10;
        }
        if(d == 1){
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for(int i = 0; i < digits.length; i++){
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }
}
