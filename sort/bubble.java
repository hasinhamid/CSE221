import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,6,4,7,8,11,10,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
     * moves the highet value to the end
     * on the go it swaps 
     */
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                int a=arr[j];
                int b=arr[j+1];
                if(a>b){
                    arr[j]=b;
                    arr[j+1]=a;
                }
            }
        }
    }
    
}
