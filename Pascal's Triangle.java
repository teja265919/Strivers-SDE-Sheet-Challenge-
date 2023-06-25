class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList();
        for(int i = 1;i <= numRows;i++){
            List<Integer> l1 = new ArrayList();
            for(int k = 1;k < i + 1;k++)
            {
                if(k == 1 || k == i){
                    l1.add(1);
                }
                else{
                    l1.add(l.get(i - 2).get(k - 1) + l.get(i - 2).get(k - 2));
                }
            }
            l.add(l1);
        }
        return l;
    }
}
