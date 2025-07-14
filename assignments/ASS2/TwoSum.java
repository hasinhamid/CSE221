package ASS2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class TwoSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String [] q= br.readLine().split(" ");
        int n=Integer.parseInt(q[0]);
        long sum=(long) Integer.parseInt(q[1]);
        String[] nums= br.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(nums[i]);
        }
        int i=0,j=n-1;
        while(i<j){
            long s=(long)arr[i]+arr[j];
            if(s==sum){
                System.out.println(i+1+" "+(j+1));
                return;
            }
            else if(s>sum){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(-1);

    }
}
