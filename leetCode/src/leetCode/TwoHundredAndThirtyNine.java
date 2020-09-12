package leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoHundredAndThirtyNine {


    public static void main(String[] args) {




    }



    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] result = new int[nums.length-k+1];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        int l = 0;
        int r = l;

        while (r < k){
            maxHeap.add(nums[r]);
            r++;
        }
        int i = 0;
        while(r < nums.length){
            result[i] = maxHeap.peek();
            maxHeap.add(nums[r]);
            r++;
            i++;
        }
        result[i] = maxHeap.peek();

        return result;
    }
}
