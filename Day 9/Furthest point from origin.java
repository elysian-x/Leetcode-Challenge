class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char move[]=moves.toCharArray();
        int x=0,r=0,l=0,w=0;
        for(int i=0;i<moves.length();i++){
            if(move[i]=='R'){
                r++;
            }
            else if(move[i]=='L'){
                l++;
            }
            else{
                w++;
            }
            }
            return (Math.abs(r-l)+w);
        }
}
