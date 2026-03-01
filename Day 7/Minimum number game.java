class Solution {
    public int[] numberGame(int[] nums) {
        int temp =0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
            if(nums[j]>nums[j+1]){
                temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
               }
            }
        }
        for(int i=0;i<nums.length;i+=2){
            temp = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
