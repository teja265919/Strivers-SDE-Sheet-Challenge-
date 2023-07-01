class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> hs = new HashMap();
        int arr[] = new int[2];
        for(int i = 0;i < nums.length;i++){
            if(!hs.containsKey(target - nums[i])){
                hs.put(nums[i],i);
            }
            else{
                arr[0] = hs.get(target - nums[i]);
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
