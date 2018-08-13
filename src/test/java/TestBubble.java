import sort.BubbleSort;

import utils.Array;

public class TestBubble {
    public static void main(String[] args) {
        int[] a = Array.a;
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
        for (int ele:a) {
            System.out.println(ele);
        }
    }
}
