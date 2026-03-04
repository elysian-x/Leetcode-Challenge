class Solution {
    public boolean isPalindrome(int x) {
        int d,x1=0;
        int x2=x;
        while(x>0){
            d=x%10;
            x1=x1*10+d;
            x=x/10;
        }
        if(x1==x2){
            return true;
        }
        else{
            return false;
        }
    }
}
