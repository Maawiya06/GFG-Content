
class Solution {
public:
    bool isSafe(int x, int y, vector<vector<int>> &m){
        int n = m.size();
        if(x < 0 || x >= n || y < 0 || y >= n){
            return 0;
        }
        return 1;
    }
    
    bool helper(int x, int y, vector<vector<int>> &m , vector<vector<int>> &sol){
        int n = m.size();
        if(x == n -1 && y == n -1){
            sol[x][y] = 1;
            return 1;
        }
        
        if(isSafe(x, y, m)){
            sol[x][y] = 1;
            for(int i=1; i<=m[x][y] && i<n; i++){
                // move right
                if(helper(x, y+i, m, sol)){
                    return 1;
                }
                if(helper(x+i, y, m, sol)){
                    return 1;
                }
            }
            sol[x][y] = 0; // back tracking
            return 0;
        }
        return 0;
    }
    
	vector<vector<int>> ShortestDistance(vector<vector<int>>&m){
	   // Code here
	   int n = m.size();
	   vector<vector<int>>sol(n, vector<int>(n, 0));
	   helper(0, 0, m, sol);
	   vector<vector<int>>ans;
	   ans.push_back({-1});
	   return sol[n-1][n-1] == 0 ? ans : sol;
	}

};

