class Solution {
    public boolean checkPerfectNumber(int num) {
        int d=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                d=d+i;
            }
        }
        if(num==d){
            return true;
        }
        else{
            return false;
        }
    }
}
