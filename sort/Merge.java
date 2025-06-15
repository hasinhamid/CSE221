import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,6,4,7,8,11,10,9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        div(arr, 0, arr.length-1);
    }
    // divids the array to subsections
    public static void div(int []arr, int left, int right){
        if(right<=left){
            return;
        }
        int mid=(left+right)/2;
        div(arr, left, mid);
        div(arr, mid+1, right);
        merge(arr,left, mid, right);
    }
    // merges those subsections 
    public static void merge(int [] arr, int l, int m, int r){
        int i=l;
        int j=m+1;
        int k=0;
        int[] nwarr=new int[r-l+1];
        
        while (i<=m && j<=r) {
            if (arr[i]<arr[j]) {
                nwarr[k++]=arr[i++];
            }
            else{
                nwarr[k++]=arr[j++];
            }
        }
        while (i<=m) {
            nwarr[k++]=arr[i++];
        }
        while (j<=r) {
            nwarr[k++]=arr[j++];
        }
        k=0;
        for(i=l;i<=r;i++,k++){
            arr[i]=nwarr[k];
        }

    }
}
