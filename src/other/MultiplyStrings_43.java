package other;

public class MultiplyStrings_43 {
	 public String multiply(String num1, String num2) {
	        if(num1.equals("0") || num2.equals("0")) return "0";
	        String result = "0";
	            
	        for(int i = 0; i < num1.length(); i++){
	            
	            int a = num1.charAt(num1.length()-1-i) - '0';
	            if(a == 0) continue;
	 
	            StringBuilder cur = new StringBuilder();
	            int count = i;
	            for(int k = 0; k < count; k++) cur.append(0);
	            
	            int carry = 0;
	            for(int j = 0; j < num2.length(); j++){
	                int b = num2.charAt(num2.length()-1-j) - '0';
	                int p = a * b + carry;
	                carry = p/10;
	                cur.append(p%10);
	            }
	            if(carry != 0) cur.append(carry);
	            
	        
	            carry = 0;
	            String addnum = cur.toString();
	            StringBuilder newresult = new StringBuilder();
	        
	            int as = 0, bs = 0;
	       
	            while(as < addnum.length() || bs < result.length()){
	                int sum = carry;
	                if(as<addnum.length()) sum += addnum.charAt(as++) -'0';
	                if(bs<result.length()) sum += result.charAt(bs++) -'0';
	                newresult.append(sum%10);
	                carry = sum/10;
	            }
	            if(carry != 0) newresult.append(carry);
	            result = newresult.toString();     
	        }
	        StringBuffer sb = new StringBuffer(result);
	        sb = sb.reverse();
	        return sb.toString();
	    }
}
