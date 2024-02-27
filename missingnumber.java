class Solution {
    public int missingNumber(int[] nums) {
        //nums
        int n = nums.length;
        int actual_sum = n*(n+1)/2;
        int array_sum = 0;
        for (int i = 0; i< n; i++ ){
            array_sum+=nums[i];
        }
        return(actual_sum-array_sum);

    }
}
