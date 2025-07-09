import java.util.Scanner;

public class minSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        int [] nums= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int count=0;
        int max;
        int idx;
        for(int i=0;i<n-1;i++){
            max=nums[i];
            idx=i;
            for(int j=i+1;j<n;j++){
                if(max<nums[j]){
                    max= nums[j];
                    idx=j;
                }
                else if(max==nums[j] && arr[idx]>arr[j]){
                    idx=j;
                }

            }
            if(idx!=i){
                count++;
                swap(arr, nums, i, idx);
            }
        }
        System.out.println("Minimum swaps: "+count);
        for(int i=0;i<n;i++){
            System.out.println("ID: "+arr[i]+" Mark: "+nums[i]);
        }
    }
    public static void swap(int[] arr, int[] brr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        temp=brr[i];
        brr[i]=brr[j];
        brr[j]=temp;
    }
}
