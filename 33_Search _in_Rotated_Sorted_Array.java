class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
                }
        }
        return -1;
    }
}

//my submission beat 100% of other submissions' runtime.

//JavaScript code
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
     for(var i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
                }
        }
        return -1;
};
