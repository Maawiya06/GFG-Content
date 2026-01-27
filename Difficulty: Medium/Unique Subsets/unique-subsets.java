class solve {
    // Function to find all possible unique subsets.
    public static void solve(int index, int[] arr, 
                       ArrayList<ArrayList<Integer>> result, ArrayList<Integer> ans){
        result.add(new ArrayList<>(ans));
        
        for(int i = index; i < arr.length; i++){
            
            if(i > index && arr[i] == arr[i - 1]) continue;
            
            ans.add(arr[i]);
            solve(i + 1, arr, result, ans);
            ans.remove(ans.size() - 1);
            
        }
    }
    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        solve(0, arr, result, ans);
        return result;
        
    }
}
