class Solution {
    public int countTriples(int n) {
        int count = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                int c2 = a * a + b * b;    // a² + b²
                int c = (int) Math.sqrt(c2);

                if (c * c == c2 && c <= n) {
                    count++;
                }
            }
        }
        return count * 2; // because (a,b,c) and (b,a,c) are considered different in LC
    }
}
