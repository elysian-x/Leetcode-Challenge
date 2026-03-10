class Solution {
    public boolean isPerfectSquare(int num) {
        int flag=0;
        if (num==1){
            return true;
        }
        else{
        for(long i=2;i<=num;i++){
            if(num==i*i){
                return true;
            }
        }
}
return false;
}
}
