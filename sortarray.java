class Solution {
    public int[] sortArray(int[] nums) {
        for ( int i = 0; i<nums.length; i++){
            int minindx = i;
            for(int j = i+1; j < nums.length; j++){
                if (nums[minindx] > nums[j]){
                    minindx = j;
                }
            }
            int s = nums[i];
            nums[i] = nums[minindx];
            nums[minindx] = s;       
        }
        return nums;
    }
   
}
