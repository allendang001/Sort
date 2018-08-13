package sort;

public class SelectSort {

    public void sort(int[] a){
        if (a.length == 0)
            return;
        for (int i = 0; i<a.length;i++){
            int tmp = a[i];
            int minIndex = i;
            for (int j = i+1;j<a.length;j++){
                if (a[j]<tmp){
                    tmp = a[j];
                    minIndex =  j;
                }
            }
            if (minIndex != i){
                a[minIndex] = a[i];
                a[i] = tmp;
            }
        }
    }
}
