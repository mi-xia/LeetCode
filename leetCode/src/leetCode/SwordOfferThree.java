package leetCode;

public class SwordOfferThree {

    public int findRepeatNumber(int[] nums) {

//        Map<Integer,Integer> map = new HashMap<>();
//        int num = 0;
//        for (int i = 0; i < nums.length; i++){
//            int numCount = map.getOrDefault(nums[i],0);
//            if (numCount > 0){
//                num = nums[i];
//            } else {
//                map.put(nums[i],1);
//            }
//        }



        for (int i=0; i < nums.length; i++){
            if (i != nums[i]){
                if (nums[nums[i]] == nums[i]){
                    return nums[i];
                }
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
                i--;
            }
        }

        return -1;
    }

}
