class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0,d;
        while(n>0){
            d=n%10;
            p=p*d;
            s=s+d;
            n=n/10;
        }
        return(p-s);
    }
}
