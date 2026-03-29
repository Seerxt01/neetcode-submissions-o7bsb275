class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Fill s1 frequency
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            // Add current char to window
            windowCount[s2.charAt(i) - 'a']++;

            // Remove char if window exceeds size
            if (i >= windowSize) {
                windowCount[s2.charAt(i - windowSize) - 'a']--;
            }

            // Compare arrays
            if (matches(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}