package sort;

public class MergeSort {

    public void sort(int[] a) {
        if(a.length==0){
            return;
        }
        mergeSort(a,0,a.length-1);
    }

    public void mergeSort(int[] a, int l, int r){
        int mid = (l+r)/2;
        if(l<r){
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }

    public void merge(int[] a,int l,int mid, int r){
        int[] tmp = new int[r - l + 1];
        int i = l;
        int j = mid+1;
        int k = 0;
        while( i <= mid && j <= r){
            if(a[i] < a[j]){
                tmp[k++] = a[i++];
            }else{
                tmp[k++] = a[j++];
            }
        }
        while(i <= mid){
            tmp[k++] = a[i++];
        }
        while(j <= r){
            tmp[k++] = a[j++];
        }
        for(int m = 0; m < tmp.length; m++){
            a[m + l] = tmp[m];
        }
    }
}