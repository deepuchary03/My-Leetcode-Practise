class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
           int j= nums.length-i-1;
                int temp = (nums[i]-1)*(nums[j]-1);
                max=Math.max(temp,max);
          

        }
return max;
    }
}
