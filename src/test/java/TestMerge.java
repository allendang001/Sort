import sort.MergeSort;
import utils.Array;

public class TestMerge {
    public static void main(String[] args) {
        int[] a = Array.a;
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a);
        for (int ele:a) {
            System.out.println(ele);
        }
    }
}
