class Solution {
    public boolean judgeCircle(String moves) {
        int position[]={0,0};
        int newpos[]={0,0};
        char c[]= moves.toCharArray();
        for(int i=0;i<moves.length();i++){
            if(c[i]=='R'){
                position[0]++;
            }
            else if (c[i]=='L'){
                position[0]--;
            }
            else if (c[i]=='U'){
                position[1]++;
            }
            else if (c[i]=='D'){
                position[1]--;
            }
        }
        return Arrays.equals(newpos,position);
    }
}
