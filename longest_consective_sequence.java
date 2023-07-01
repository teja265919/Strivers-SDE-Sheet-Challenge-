class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }

        int longstreak = 0;
        for(int i : nums){
            if(!hs.contains((i - 1))){
               int curstreak = 1;
               int curnum = i;
                while(hs.contains(curnum + 1)){
                    curnum += 1;
                    curstreak += 1;
                }
                longstreak = Math.max(longstreak,curstreak);
            }
        }
        return longstreak;
    }
}
