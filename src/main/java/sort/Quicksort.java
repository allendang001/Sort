package sort;

import utils.Swap;

public class Quicksort {

    public int partition(int[] array, int left ,int right){
        int index = left;
        int base = array[right];
        for (int i = left; i<right; i++){
            if (array[i]<base){
                Swap.swap(array,i,index);
                index++;
            }
        }
        Swap.swap(array,index,right);
        return index;
    }

    public void quickSort(int[] array, int left, int right){
        if (left>right){
            return;
        }
        int mid = partition(array,left,right);
        quickSort(array,left,mid-1);
        quickSort(array,mid+1,right);
    }

    public void sort(int[] array){
        if (array.length == 0){
            return;
        }
        quickSort(array,0, array.length-1);
    }
}
