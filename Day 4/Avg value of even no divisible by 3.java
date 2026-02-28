class Solution {
    public int averageValue(int[] nums) {
        int cnt = 0;
        int s = 0;
        for (int n : nums) {
            if (n % 2 == 0 && n % 3 == 0) {
                cnt++;
                s += n;
            }
        }

        if (cnt == 0) return 0;

        return s / cnt;
    }
}
