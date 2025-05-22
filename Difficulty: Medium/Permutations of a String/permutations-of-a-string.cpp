
class Solution {
  public:
    void findPermutationHelper(string &s, int index, unordered_set<string> &uniquePerms, vector<string> &result) {
        if (index >= s.length()) {
            if (uniquePerms.find(s) == uniquePerms.end()) {
                uniquePerms.insert(s);
                result.push_back(s);
            }
            return;
        }

        for (int j = index; j < s.length(); j++) {
            swap(s[index], s[j]);
            findPermutationHelper(s, index + 1, uniquePerms, result);
            swap(s[index], s[j]); // Backtrack
        }
    }

    vector<string> findPermutation(string &s) {
        vector<string> result;
        unordered_set<string> uniquePerms;
        findPermutationHelper(s, 0, uniquePerms, result);
        return result;
    }
};


