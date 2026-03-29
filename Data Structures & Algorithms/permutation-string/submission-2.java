class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // store frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            // add current char
            count2[s2.charAt(i) - 'a']++;

            // remove left char when window exceeds size
            if (i >= k) {
                count2[s2.charAt(i - k) - 'a']--;
            }

            // check if both arrays match
            if (matches(count1, count2)) {
                return true;
            }
        }

        return false;
    }

    // helper function to compare arrays
    public boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}