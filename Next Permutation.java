class Solution {
   public  void  nextPermutation(int nums[]){
        List<Integer> A = new ArrayList();
        for(int i = 0;i < nums.length;i++){
             A.add(nums[i]);
        }
         int idx = -1;
         int n = A.size();
       for(int i = n - 2;i >= 0;i--){
           if(A.get(i) < A.get(i + 1)){
               idx = i;
               break;
           }
       }
       if(idx == -1){
           Collections.reverse(A);
           System.out.print(A);
          
       for(int i = 0;i < n;i++){
           nums[i] = A.get(i);
       }
        
       }
  else{
       for(int i = n -1;i > idx;i--){
           if(A.get(i) > A.get(idx)){
               int temp = A.get(i);
               A.set(i,A.get(idx));
               A.set(idx,temp);
               break;
           }
       }
      
       Collections.reverse(A.subList(idx + 1,n));
       
       for(int i = 0;i < n;i++){
           nums[i] = A.get(i);
       }

       System.out.print(A);
  }
    
     }
       
   
    
       

}
