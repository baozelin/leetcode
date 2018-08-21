package backtracking;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationsofaPhoneNumber_17 {
    String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ret;
        
        combination("", digits, ret);
        return ret;
        
    }
    
    void combination(String pre, String digits, List<String> ret){
        if(pre.length() == digits.length()){
            ret.add(pre);
            return;
        }
        
        String letters = key[digits.charAt(pre.length()) - '0'];
        for(int i = 0; i < letters.length(); i++){
            pre = pre + letters.charAt(i);
            
            combination(pre, digits, ret);
            //pre.deleteCharAt(pre.length() - 1);
            pre = pre.substring(0, pre.length()-1);
        }
    }
    
    /**
     * Stringbuild
     */
    
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations1(String digits) {
        List<String> ret = new ArrayList<>();
        if (digits == null || digits.length() == 0) return ret;
        combination(new StringBuilder(), digits, ret);
        return ret;
    }

    private void combination(StringBuilder prefix, String digits, List<String> ret) {
        if (prefix.length() == digits.length()) {
            ret.add(prefix.toString());
            return;
        }
        String letters = KEYS[digits.charAt(prefix.length()) - '0'];
        for (char c : letters.toCharArray()) {
            prefix.append(c);
            combination(prefix, digits, ret);
            prefix.deleteCharAt(prefix.length() - 1); // 删除
        }
    }
    
}