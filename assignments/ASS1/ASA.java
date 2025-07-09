import java.util.Scanner;

public class ASA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (n==1) {
            System.out.println(arr[0]);
        }
        else{
            for(int i=0;i<n;i++){
            for(int j=0,k=1;j<n-1;j++,k++){
                if(arr[j]%2==0 && arr[k]%2==0){
                    swap(arr, j, k);
                }
                else if(arr[j]%2!=0 && arr[k]%2!=0){
                    swap(arr, j, k);
                }
                else{
                    continue;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

        }
        
    }
    public static void swap(int[] arr, int i,int j){
        if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
    
}
