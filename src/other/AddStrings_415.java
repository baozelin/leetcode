package other;

public class AddStrings_415 {
	public String addStrings(String num1, String num2) {
        if(num1 == null || num1.charAt(0) == 0) return num2;
        if(num2 == null || num2.charAt(0) == 0) return num1;
        
        
        StringBuilder result = new StringBuilder();
        //String res = "";
        int carry = 0;
        int length = Math.max(num1.length(), num2.length());
        
        for(int i = 0; i < length; i++){
            int a,b;
            if(i > num1.length()-1) a = 0;
            else a = num1.charAt(num1.length() -1-i) - '0';
            
            if(i > num2.length() -1) b = 0;
            else b = num2.charAt(num2.length() -1 -i) - '0';
            
            int tmp = a + b + carry;
            carry = tmp /10;
            result.append(tmp%10);
        }
        
        if(carry != 0) result.append(carry);
        result = result.reverse();
        
        return result.toString();
    }
}
