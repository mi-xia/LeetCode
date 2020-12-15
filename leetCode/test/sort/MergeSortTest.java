package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(new int[]{2,3,7,2,3,9,5,6});
    }
}