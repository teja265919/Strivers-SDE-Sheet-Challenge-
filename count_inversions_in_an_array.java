import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long cnt = 0;
       for(int i = 0;i < n;i++){
           for(int j = 0;j < n - i - 1;j++){
               if(arr[j] > arr[j + 1]){
                   long temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                   cnt += 1;
               }
           }
       }
       return cnt;
    }
}
