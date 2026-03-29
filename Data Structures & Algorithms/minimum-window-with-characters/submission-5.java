

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> mapt = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();

        // count t
        for (char c : t.toCharArray()) {
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int required = mapt.size();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            maps.put(c, maps.getOrDefault(c, 0) + 1);

            // match check
            if (mapt.containsKey(c) && maps.get(c).intValue() == mapt.get(c).intValue()) {
                have++;
            }

            // shrink window
            while (have == required) {

                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                maps.put(leftChar, maps.get(leftChar) - 1);

                if (mapt.containsKey(leftChar) &&
                    maps.get(leftChar) < mapt.get(leftChar)) {
                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
