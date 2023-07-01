public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
      int cnt = 0;
      int xr = 0;
      Map<Integer,Integer> hs = new HashMap();
       hs.put(0,1);
        for(int i= 0;i < n;i++){
               xr = xr ^A[i];
              int x =xr ^ B;
               if(hs.containsKey(x)){
                   cnt += hs.get(x);
               }
               if(hs.containsKey(xr)){
                   hs.put(xr,hs.get(xr) + 1);
               }
               else{
                   hs.put(xr,1);
               }
        
        }
        return cnt;
    }
}
