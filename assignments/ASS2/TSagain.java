package ASS2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class TSagain {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String [] line= br.readLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int m= Integer.parseInt(line[1]);
        long k=(long) Integer.parseInt(line[2]);
        String[] line1= br.readLine().split(" ");
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=Integer.parseInt(line1[i]);
        }
        String []line2= br.readLine().split(" ");
        int[] arr2= new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=Integer.parseInt(line2[i]);
        }
        int i=0,j=m-1;
        int idx1=i;
        int idx2=j;
        long min=Math.abs(arr1[i]+arr2[j]-k);
        while(i<n && j>=0){
            long s= Math.abs(arr1[i]+arr2[j]-k);
            if(s==0){
                System.out.println(i+1+" "+(j+1));
                return;
            }
            else if(s<=min){
                long sign= arr1[i]+arr2[j]-k;
                min=s;
                idx1=i;
                idx2=j;
                if(sign<0){
                    i++;
                }
                else{
                    j--;
                }
            }
            else{
                long sign= arr1[i]+arr2[j]-k;
                if(sign<0){
                    i++;
                }
                else{
                    j--;
                }
            }
                
        }
        System.out.println(idx1+1+" "+(idx2+1));
        
    }
}
