class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
       
    }
}class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int pos=nums[n-1]*nums[n-2]*nums[n-3]; // calculating the last digits like postive values only
        int neg= nums[0]*nums[1]*nums[n-1]; // if nums contains negative max numbers then we can use two of them to cancel negative sign and last digit wich is positive
         int ans=Math.max(pos,neg);
        return ans;
    }
}
