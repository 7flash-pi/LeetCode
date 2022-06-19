class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        fun(nums, ds,ans, freq);
        return ans;
    }
    public void fun(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[] freq){
        if(ds.size()==nums.length && !ans.contains(ds)){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                fun(nums, ds,ans, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
        
}