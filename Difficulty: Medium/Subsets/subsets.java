class Solution {
    void solve(int index, int arr[], ArrayList<ArrayList<Integer>> result, ArrayList<Integer> ans){
        if(index == arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        
        
            ans.add(arr[index]);
            solve(index + 1, arr, result, ans);
            ans.remove(ans.size() - 1);
            solve(index + 1, arr, result, ans);
        
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        solve(0, arr, result, ans);
        return result;
    }
}