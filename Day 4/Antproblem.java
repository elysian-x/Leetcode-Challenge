class Solution {
    public int returnToBoundaryCount(int[]nums) {
        int x = 0,k=0;
        for(int i=0;i<nums.length;i++){
            x=x+nums[i];
            if (x==0){
                k++;
            }
        }
        return k;

    }
}
