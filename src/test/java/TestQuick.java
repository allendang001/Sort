import sort.Quicksort;
import utils.Array;

public class TestQuick {
    public static void main(String[] args) {
        int[] a = Array.a;
        Quicksort quicksort = new Quicksort();
        quicksort.sort(a);
        for (int ele:a) {
            System.out.println(ele);
        }
    }
}
