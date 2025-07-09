package search;
// O(log3 n)
// instead of 2 like in binary search it divids into 3 parts
// sorted mendatory
public class TernarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=5;
        int idx= terSearch(arr,k); //idx=4
        System.out.println(idx);
    }
    public static int terSearch(int [] arr, int k){
        return TS(arr,k, 0, arr.length-1);
    }
    public static int TS(int[] arr, int k, int l, int r){
        if(l>r){
            return -1;
        }
        int mid1= (r+l)/3;
        int mid2= (r+l)*2/3;
        if(arr[mid1]==k){
            return mid1;
        }
        else if(arr[mid2]==k){
            return mid2;
        }
        // suppose arr={ 1,2,3,4,5,6,7,8,9,10,11,12}
        else if(arr[mid1]>k){   // 1,2,3,4    
            return TS(arr, k, l, mid1);
        }
        else if(arr[mid2]<k){   //9,10,11,12 
            return TS(arr, k, mid2, r);
        }
        else{                   //5,6,7,8
            return TS(arr, k, mid1, mid2);
        }
    }
}
