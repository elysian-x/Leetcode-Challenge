class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0,dsum=0;
        for(int i=0;i<nums.length;i++){
            esum=esum+nums[i];
            while(nums[i]>0){
                dsum=dsum + (nums[i]%10);
                nums[i]=nums[i]/10;
            }
        }
        return (Math.abs(esum -dsum));
    }
}  
