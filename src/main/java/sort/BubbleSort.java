package sort;

import utils.Swap;

public class BubbleSort {

    public void sort(int[] a){
        if (a.length==0)
            return;
        for (int i = 0; i<a.length;i++)
            for (int j = i+1;j<a.length;j++)
                if (a[i]>a[j])
                    Swap.swap(a,i,j);
    }
}
