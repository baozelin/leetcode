package 双指针;

public class ReverseVowelsofaString_345 {
	public String reverseVowels(String s) {
        String vowels = "aoeiuAOEIU";
        char[] a = s.toCharArray();
        int left = 0, right = s.length() -1;
        while(left < right){
           if(vowels.contains(a[left]+"") && vowels.contains(a[right] + "")){
               char tmp = a[left];
               a[left] = a[right];
               a[right] = tmp;
               left++;
               right--;
           }
            else if(vowels.contains(a[left] +"")){
                right--;
            }else{
                left++;
            }
        }
        return new String(a);
    }
}
