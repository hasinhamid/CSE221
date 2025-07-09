package ASS2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
public class triple {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] line= br.readLine().split(" ");
        int n= Integer.parseInt(line[0]);
        int tar= Integer.parseInt(line[1]);
        String[] strArr= br.readLine().split(" ");
        Integer[] arr=new Integer[n];
        Integer[] nums= new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(strArr[i]);
            nums[i]=arr[i];
        }
        Arrays.sort(arr);
        Integer a=0,b=0,c=0;
        boolean bool=false;
        for(int i=0;i<arr.length && !bool;i++){
            a=arr[i];
            int j=i+1,k=arr.length-1;
            int TS=tar-a;
            while (j<k && !bool) {
                int sum= arr[j]+arr[k];
                if(sum==TS){
                    b=arr[j];
                    c=arr[k];
                    bool=true;
                }
                else if(sum<TS){
                    j++;
                }
                else{
                    k--;
                }
            }

        }
        if(bool){
            for(int i=0;i<arr.length;i++ ){
                if (nums[i].equals(a)) {
                    System.out.print(i+1+" ");
                    a=null;
                }
                else if(nums[i].equals(b)){
                    System.out.print(i+1+" ");
                    b=null;
                }
                else if(nums[i].equals(c)){
                    System.out.print(i+1+" ");
                    c=null;
                }
            }
        }
        else{
            System.out.println(-1);
        }
        


    }
}
