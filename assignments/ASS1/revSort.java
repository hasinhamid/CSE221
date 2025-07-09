import java.util.Scanner;

public class revSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc. nextLine());
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-2;j++){
                if(arr[j]>arr[j+2]){
                    int temp=arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
