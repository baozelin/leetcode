package 排序;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;



public class SortCharactersByFrequency_451 {
	public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i =0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>( new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return b.num - a.num;     
            }
        });
        
        for(char key : map.keySet()){
            Pair p = new Pair(key, map.get(key));
            queue.add(p);
        }
        
        char[] ret = new char[s.length()];
        
        for(int i = 0; i < s.length();){
            int count = queue.peek().num;
            while(count > 0){
                ret[i] = (char) queue.peek().key;
                i++;
                count--;
            }
            queue.poll();
        }
    return new String(ret);
    }
	
	 public static void main(String[]arg) {
		 SortCharactersByFrequency_451 t = new SortCharactersByFrequency_451();
		 String S = "aaaccc";
		 S = t.frequencySort(S);
		System.out.println(S);
		int[] aa = new int[] {1,2,3,4,5};
		//Strinf b = new String(aa);
		//System.out.println(new String(aa));
	 }
	
}
    
class Pair{
	char key;
    int num;
    public Pair(char key, int num){
        this.key = key;
        this.num = num;
    }

}
