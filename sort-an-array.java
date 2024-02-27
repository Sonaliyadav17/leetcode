class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i<nums.length;i++){
            int minEleIndx = i;
            for (int j = i+1; j< nums.length;j++){
                if (nums[minEleIndx]>nums[j]){
                    minEleIndx = j;
                }

            }
            int s = nums[i];
            nums[i] = nums[minEleIndx];
            nums[minEleIndx] = s;
            

        }
        
    }
}
