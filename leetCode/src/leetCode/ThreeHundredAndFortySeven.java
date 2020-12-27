package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/top-k-frequent-elements/comments/
 * @date 2020/12/27 11:28
 */
public class ThreeHundredAndFortySeven {

//    public int[] topKFrequent(int[] nums, int k) {
//
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i : nums){
//            int count = map.getOrDefault(i,0);
//            map.put(i,count+1);
//        }
//
//        int[] res = new int[k];
//
//        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)-> map.get(o2)-map.get(o1));
//
//        queue.addAll(map.keySet());
//
//        for (int i = 0; i < k; i++){
//            res[i] = queue.remove();
//        }
//
//        return res;
//    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            int count = map.getOrDefault(i,0);
            map.put(i,count+1);
        }

        int[] res = new int[k];

        PriorityQueue<Integer> queue = new PriorityQueue<>(k,(o1, o2)-> map.get(o1)-map.get(o2));

        queue.addAll(map.keySet());

        for (int i = 0; i < k; i++){
            res[i] = queue.remove();
        }

        return res;
    }
}
