package 贪心;

public class IsSubsequence_392 {
	public boolean isSubsequence(String s, String t) {
        int i, j, last = 0;
        
    for (i = 0; i < s.length(); i++) {
        for (j = last; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                last = j + 1;
                break;
            }
        }
        if (j == t.length()) return false;  // 因为数组玩了才结束
    }
 return true;
}
	
	
	public boolean isSubsequence2(String s, String t) {
        int lenS=s.length(); 
       int lenT=t.length();
       int i=0,j=0;
       while(i<lenS&&j<lenT)
       {
       		if(s.charAt(i)==t.charAt(j))
       		{
       			i++;
       			j++;
       		}
       		else
       			j++;
       }
       return i==lenS;
}
}
