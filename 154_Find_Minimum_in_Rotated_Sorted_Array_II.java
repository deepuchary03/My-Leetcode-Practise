class Solution {
    public int findMin(int[] nums) {
         int ans=100000;
        for(int i=0;i<nums.length;i++)
        {
            ans=Math.min(ans,nums[i]);
        }
        return ans;
    }
}
