import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            boolean bool=true;
            int[] arr=new int[a];
            for(int j=0;j<a;j++){
                arr[j]=sc.nextInt();
                if(j>0){
                    if (arr[j]<arr[j-1]) {
                        bool=false;
                    }
                }
            }
            if(bool){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
    
}
