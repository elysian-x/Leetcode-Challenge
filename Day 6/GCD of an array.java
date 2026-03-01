class Solution {
    public int findGCD(int[] nums) {
        int small=nums[0],large=0,gcd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large=nums[i];
            }
            if(nums[i]<small){
                small=nums[i];
            }
        }
        for(int i=1;i<=small;i++){
            if (small%i==0 && large%i==0){
                if(i>gcd){
                    gcd=i;
                }
            }
        }
    return gcd;
    }
}
