class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int n = position.length;

    // Step 1: store position and speed together
    int[][] cars = new int[n][2];
    for (int i = 0; i < n; i++) {
        cars[i][0] = position[i];
        cars[i][1] = speed[i];
    }

    // Step 2: sort by position (descending)
    Arrays.sort(cars, (a, b) -> b[0] - a[0]);

    // Step 3: process times
    int fleets = 0;
    double maxTime = 0;

    for (int i = 0; i < n; i++) {
        double time = (double)(target - cars[i][0]) / cars[i][1];

        if (time > maxTime) {
            fleets++;
            maxTime = time;
        }
    }

    return fleets;
}
}
