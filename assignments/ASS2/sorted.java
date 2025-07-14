package ASS2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class sorted {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim()) ;
        String[] line1= br.readLine().split(" ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(line1[i]);
        }
        int m=Integer.parseInt(br.readLine().trim()) ;
        int[] arr2= new int[m];
        String[] line2= br.readLine().split(" ");
        for(int i=0;i<m;i++){
            arr2[i]= Integer.parseInt(line2[i]);
        }
        int i=0,j=0,k=0;
        int[] ans= new int[n+m];
        
        while (i<n && j<m) {
            if(arr[i]<arr2[j]){
                ans[k++]=arr[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while (i<n) {
            ans[k++]=arr[i++];
        }
        while (j<m) {
            ans[k++]=arr2[j++];
        }
        StringBuilder sb= new StringBuilder();
        for(int ptr:ans){
            sb.append(ptr).append(" ");
        }
        System.out.println(sb.toString());
    }
}
