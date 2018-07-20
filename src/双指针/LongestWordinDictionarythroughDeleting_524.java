package 双指针;

import java.util.List;

public class LongestWordinDictionarythroughDeleting_524 {
	public String findLongestWord(String s, List<String> d) {
        if(s == null) return "";
        String ret = "";
        for(String str: d){
            for(int i = 0, j = 0; i < s.length() && j < str.length(); i++){
                if(s.charAt(i) == str.charAt(j)) j++;
                
                if(j == str.length() ){
               // String tmp = str;
                if(str.length() > ret.length() || (str.length() == ret.length() && str.compareTo(ret) < 0))
                   ret = str;
                }
            }
            
        }
        return ret;
    }

}
