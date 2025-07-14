
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;
public class KD {
    public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String[] line1=br.readLine().split(" ");
    int n=Integer.parseInt(line1[0]);
    int a= Integer.parseInt(line1[1]);
    String[] line2= br.readLine().split(" ");
    int [] arr= new int [n];
    for(int i=0;i<n;i++){
        arr[i]= Integer.parseInt(line2[i]);
    }
    int ans= sol(arr,a);
    System.out.println(ans);

    }

    public static int sol(int[] arr, int a){
        int ans=1;
        HashMap <Integer,Integer> map= new HashMap<>();
        int i=0,j=0;
        map.put(arr[i++], 1);
        while (i<arr.length) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
            while(map.size()>a){
                map.put(arr[j], map.get(arr[j])-1);
                if(map.get(arr[j])==0){
                    map.remove(arr[j]);
                }
                j++;
            }
            i++;
            ans= Math.max(ans, i-j);
        }
        
        return ans;

    }

    //n^2 solution:
    // public static int sol(int[] arr, int a){
    //     int ans=1;
    //     for( int i=0;i<arr.length-1;i++){
    //         HashSet<Integer> set= new HashSet<>();
    //         set.add(arr[i]);
    //         int count=1;
    //         int ch=a-1,j=i+1;;
    //         while(ch>=0 && j< arr.length){
    //             if (set.contains(arr[j])) {
    //                 j++;
    //                 count++;
    //             }
    //             else{
    //                 ch--;
    //                 if(ch<0){
    //                     break;
    //                 }
    //                 set.add(arr[j]);
    //                 count++;
    //                 j++;
    //             }
    //         }
    //         if(ans<count){
    //             ans=count;
    //         }
    //     }

    //     return ans;

    // }
}
