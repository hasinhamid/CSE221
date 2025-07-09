package search;
//when array is sorted 
// O(logn)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=5;
        int idx= binSearch(arr,k); //idx=4
        System.out.println(idx);
    }
    public static int binSearch(int[] arr, int k){
        return BS(arr, k, 0, arr.length-1);
    }
    public static int BS(int[] arr, int k, int l, int r){
        if (l>r) {
            return -1;
        }
        int mid= l+(r-l)/2;
        int val=arr[mid];
        if(val==k){
            return mid;
        }
        else if(val<k){
            return BS(arr, k, l, mid);
        }
        else{
            return BS(arr, k, mid, r);
        }
    }
}
