
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class longestSubArr {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] str= br.readLine().split(" ");
        int n= Integer.parseInt(str[0]);
        int k= Integer.parseInt(str[1]);
        String[] line= br.readLine().split(" ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(line[i]);
            if(i>0){
                arr[i]+=arr[i-1];
            }
        }
        int longest=0,len=0,sum=0;
        int i=-1,j=0;
        
        while (j<n && i<j) {
                if(i==-1){
                    sum=arr[j];
                }
                else{
                    sum=arr[j]-arr[i];
                }
                if(sum<=k){
                    if(i==-1){
                        len=j+1;
                    }
                    else{
                        len=j-i;
                    }
                    
                    if(len>longest){
                        longest=len;
                    }
                    j++;
                }
                else{
                    i++;
                    if(i==j){
                        j++;
                    }
                    
                }
            
        }
        System.out.println(longest);

    }
}
