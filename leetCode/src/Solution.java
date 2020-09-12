import leetCode.OneHundredAndNinetyEight;

public class Solution {

    public static void main(String[] args) {


        OneHundredAndNinetyEight s = new OneHundredAndNinetyEight();
        int res = s.rob(new int[]{2,7,9,3,1});
        System.out.println(res);
//        int[] nums = {1,1};

//        List<Integer> list = new ArrayList<Integer>();
//        List<List<Integer>> lists = new ArrayList<List<Integer>>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        lists.add(list);
//        System.out.println(lists);
//        List list2 = new ArrayList();
//        list2.addAll(list);
//        list.remove(2);
//        String s = list.toString();
//        String demosub = s.substring(1,s.length()-1);
//        String demosub = "/1/2/3";
//        demosub = demosub.substring(1);
//        String demoArray[] = demosub.split("/");
//        List<String> demoList = Arrays.asList(demoArray);
//        List<Integer> filePermissionList = new ArrayList<>();
//        demoList.forEach(e->{
//            filePermissionList.add(Integer.valueOf(e));
//        });

//        LogUerDto logUerDto = new LogUerDto();
//
//        Map<String, Object> criteria = new HashMap<>();
//        criteria.put("user",logUerDto);
//        LogUerDto logUerDtoMap = (LogUerDto)criteria.get("user");
//        System.out.println(logUerDtoMap);



//        nextPermutation(nums);

    }



    public static void nextPermutation(int[] nums) {
        int a = -1;
        int b = -1;
        int c = -1;

        for(int i = nums.length-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                a = i-1;
                break;
            }
        }

        if(a == -1){
            tr(nums, 0, nums.length - 1);
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

    public static void tr(int[] nums, int l, int r){
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

}
