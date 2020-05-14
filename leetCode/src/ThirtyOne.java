public class ThirtyOne {



    public void nextPermutation(int[] nums) {

        int a = 0;

        for (int i=nums.length-1; i > 0 ; i--) {
            if (nums[i] > nums[i-1]){
                a = i;
            }
        }






    }

}
