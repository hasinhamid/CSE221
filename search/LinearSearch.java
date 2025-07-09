package search;
//sorted/unsorted
//O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int []arr={3,4,5,6,8,7,2,1};
        int k=5;
        int idx=linSearch(arr, k);
        System.out.println(idx); //output 2
    }
    public static int linSearch(int[] arr, int a){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==a) {
                return i;
            }
        }
        return -1;
    }
    
}
