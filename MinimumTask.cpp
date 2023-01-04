class Solution {
public:
    int minimumRounds(vector<int>& A) {
        unordered_map<int, int> m;
        for (int n : A) m[n]++;
        int ans = 0;
        for (auto &[n, cnt] : m) {
            if (cnt == 1) return -1;
            ans += (cnt + 2) / 3;
        }
        return ans;
    }
};