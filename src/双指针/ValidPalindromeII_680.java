package 双指针;

public class ValidPalindromeII_680 {
	public boolean validPalindrome(String s) {
        char[] a = s.toCharArray();
        int l = 0, r = s.length() - 1;
        int count = 0;
        while(l < r){
            if(a[l] == a[r]) {
                l++;
                r--;
            }
            else {
                count++;
                l++;
            }
        }
        if(count < 2){
            return true;
        }
        count = 0;
        l = 0;
        r = s.length()-1;
        
        while(l < r){
            if(a[l] == a[r]) {
                l++;
                r--;
            }
            else {
                count++;
                r--;
            }
        }
       if(count < 2){
            return true;
        }
        return false;
    }
}
