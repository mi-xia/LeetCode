package sort;

/**
 * @author 邹磊
 * @version 1.0
 * @description: 归并排序 https://www.jianshu.com/p/33cffa1ce613
 * @date 2020/12/15 22:36
 */
public class MergeSort{


    public void mergeSort(int[] arrys){

        sort(arrys,0,arrys.length-1);
        System.out.print(arrys);
    }

    public void sort(int[] arrays, int l, int r){

        if (l == r){
            return;
        }
        //求中位数
        int mid = l + ((r-l) >> 1);

        //左右排序
        sort(arrays,l,mid);
        sort(arrays,mid+1,r);

        //合并
        merge(arrays,l,mid,r);

    }

    private void merge(int[] arrays, int l, int mid, int r) {

        int[] temp = new int[r - l + 1];
        int p1 = l;
        int p2 = mid+1;
        int i = 0;

        while (p1 <= mid && p2 <= r){
            temp[i++] = arrays[p1] < arrays[p2] ? arrays[p1++] : arrays[p2++];
        }

        while(p1 <= mid) {
            temp[i++] = arrays[p1++];
        }
        while(p2 <= r) {
            temp[i++] = arrays[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for(i = 0; i < temp.length; i++) {
            arrays[l + i] = temp[i];
        }

    }

}
