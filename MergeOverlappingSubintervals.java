class Solution {
    public static List<List<Integer>> mergeoverlapping(int[][] arr){
        int n = arr.length;

        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(ans.isEmpty() || ans.get(ans.size() - 1).get(1) < arr[i][0]){
                ans.add(Arrays.asList(arr[i][0] , arr[i][1]));
            }
            else{
    ans.get(ans.size() - 1).set(1,Math.max((ans.get(ans.size() - 1)).get(1),arr[i][1]));
            }
        }
        return ans;
    }
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = mergeoverlapping(intervals);
        int arr[][] = new int[ans.size()][2];
        for(int i = 0;i < ans.size();i++){
            int arr2[] = new int[2];
            for(int j = 0;j < 2;j++){
                    arr[i][j] =ans.get(i).get(j);
            }
        }
        return arr;
    }
}
