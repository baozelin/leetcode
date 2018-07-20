package 排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;



public class TopKFrequentElements_347 {   
	public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return a.count - b.count;
            }
        });
        
        int[] tmp = new int[map.size()];
        for (int key : map.keySet()) {
            Pair p = new Pair(key, map.get(key));
            queue.add(p);
            if(queue.size()>k){
                queue.poll();
            }
        }
        
        while(queue.size()>0){
            ret.add(queue.poll().num);
        }
        Collections.reverse(ret);
        return ret;
    }
        
        
class Pair{
    int num;
    int count;
    public Pair(int num, int count){
        this.num=num;
        this.count=count;
    }
    }
}

