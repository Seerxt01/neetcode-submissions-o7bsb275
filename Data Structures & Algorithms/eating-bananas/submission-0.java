class Solution{
    public int minEatingSpeed(int[] piles, int h) {
    int left = 1, right = 0;

    // find max pile
    for (int p : piles) {
        if (p > right) right = p;
    }

    while (left < right) {
        int mid = (left + right) / 2;

        int hours = 0;
        for (int p : piles) {
            hours += (p + mid - 1) / mid; // ceil
        }

        if (hours <= h) {
            right = mid;   // try smaller
        } else {
            left = mid + 1; // need faster
        }
    }

    return left;
}
}