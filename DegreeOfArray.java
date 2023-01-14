class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        map<int, int> left, right, count;
        int degree = 0;
        
        for(int i = 0; i < nums.size(); i++){
            int x = nums[i];
            if(left.find(x) == left.end()){
                left[x] = i;
            }
            right[x] = i;
            if(count.find(x) == count.end()){
                count[x] = 1;
            }else{
                count[x] += 1;
            }
            degree = max(degree, count[x]);
        }
        
        int ans = nums.size();
        
        for(map<int, int>::iterator it = count.begin(); it != count.end(); it++){
            int x = it->first;
            if(count[x] == degree){
                ans = min(ans, right[x] - left[x] + 1);
            }
        }
        
        return ans;
    }
};