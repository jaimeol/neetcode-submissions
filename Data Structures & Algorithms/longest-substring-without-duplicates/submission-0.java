class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> windowSet = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()) {
            char currentChar = s.charAt(right);

            while (windowSet.contains(currentChar)){
                windowSet.remove(s.charAt(left));
                left++;
            }

            windowSet.add(currentChar);

            int currentWindowSize = right - left + 1;
            maxLength = Math.max(maxLength, currentWindowSize);
            right++;
        }
        return maxLength;
    }
}
