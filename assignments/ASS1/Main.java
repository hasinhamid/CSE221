import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool=true;
        int n= Integer.parseInt(sc.nextLine());
        int[] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        long inv=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    inv++;
                }
            }
        }

        if(inv%2==0){
            System.out.println("YES");
        }
        
        else{
            System.out.println("NO");
        }

    }
}