package leetCode;

public class ThirtyOne {

        public void nextPermutation(int[] nums) {
            int a = -1;
            int b = -1;
            int c = -1;

            if(nums.length == 1){
                return;
            }
            for(int i = nums.length-1; i>0; i--){
                if(nums[i] > nums[i-1]){
                    a = i-1;
                    break;
                }
            }

            if(a == -1){
                tr(nums,0,nums.length-1);
                return;
            }


            for(int i = nums.length-1; i > 0; i--){
                if(nums[i] > nums[a]){
                    b = i;
                    break;
                }
            }

            c = nums[a];
            nums[a] = nums[b];
            nums[b] = c;

            tr(nums,a+1,nums.length -1);

        }

        public void tr(int[] nums, int l, int r){
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }

}
