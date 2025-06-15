import java.util.Arrays;

public class selection{
    public static void main(String[] args) {
        int[] arr={2,3,5,1,6,4,7,8,11,10,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    /*
     * selects lowest value index swap that with 0th index,
     * repeat for 2nd lowest, 3rd lowest so on so forth
     */
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int idx=i;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    idx=j;
                    min=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[idx]=temp;
        }
        
    }
}