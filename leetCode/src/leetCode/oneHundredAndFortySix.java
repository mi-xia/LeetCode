package leetCode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 邹磊
 * @version 1.0
 * @description: https://leetcode-cn.com/problems/lru-cache/submissions/
 * https://leetcode-cn.com/problems/lru-cache/solution/yuan-yu-linkedhashmapyuan-ma-by-jeromememory/
 * @date 2020/10/14 20:19
 */
public class oneHundredAndFortySix  {

    class LRUCache extends LinkedHashMap<Integer,Integer> {

        private int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return super.getOrDefault(key,-1);
        }

        public void put(int key, int value) {
            super.put(key,value);
        }


        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }


}
