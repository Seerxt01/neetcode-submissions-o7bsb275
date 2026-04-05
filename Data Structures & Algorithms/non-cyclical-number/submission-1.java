class Solution {
   
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            if (set.contains(n)) {
                return false;   // loop detected
            }

            set.add(n);         // mark as seen
            n = f(n);           // move to next number
        }

        return true;            // reached 1 → happy number
    }

    public int f(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
    