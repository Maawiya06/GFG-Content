import java.util.*;

class Solution {
    public ArrayList<Integer> largestSubset(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        // dp[i] = largest subset ending at index i
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) dp.add(new ArrayList<>());

        dp.get(0).add(arr[0]);
        List<Integer> maxSubset = new ArrayList<>(dp.get(0));

        for (int i = 1; i < n; i++) {
            List<Integer> bestPrev = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    if (dp.get(j).size() > bestPrev.size()) {
                        bestPrev = dp.get(j);
                    } else if (dp.get(j).size() == bestPrev.size()) {
                        List<Integer> candidate = dp.get(j);
                        if (isLexGreater(candidate, bestPrev)) {
                            bestPrev = candidate;
                        }
                    }
                }
            }
            dp.get(i).addAll(bestPrev);
            dp.get(i).add(arr[i]);

            if (dp.get(i).size() > maxSubset.size()) {
                maxSubset = dp.get(i);
            } else if (dp.get(i).size() == maxSubset.size() && isLexGreater(dp.get(i), maxSubset)) {
                maxSubset = dp.get(i);
            }
        }

        return new ArrayList<>(maxSubset);
    }

    private boolean isLexGreater(List<Integer> a, List<Integer> b) {
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) > b.get(i);
            }
        }
        return a.size() > b.size();
    }
}
