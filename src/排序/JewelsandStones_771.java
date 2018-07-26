package 排序;

import java.util.HashMap;

public class JewelsandStones_771 {
	public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> ret = new HashMap<Character,Integer>();
        char[] je = J.toCharArray();
        char[] se = S.toCharArray();
        
        for(char j : je){
            ret.put(j, 0);
        }
        
        for(char s:se){
            if(ret.containsKey(s)){
                int tmp = ret.get(s);
                    tmp++;
                ret.put(s, tmp);
            }
        }
        int rest = 0;
         for(char j : je){
            rest = rest + ret.get(j);
        }
        return rest;
    }
}
