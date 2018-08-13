import sort.SelectSort;
import utils.Array;

public class TestSelect {
    public static void main(String[] args) {
        int[] a = Array.a;
        SelectSort selectSort = new SelectSort();
        selectSort.sort(a);
        for (int ele: a) {
            System.out.println(ele);
        }
    }
}
