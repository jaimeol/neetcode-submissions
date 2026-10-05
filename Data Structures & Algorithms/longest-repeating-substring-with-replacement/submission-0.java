class Solution {
    public int characterReplacement(String s, int k) {
        int [] charCounts = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCounts[rightChar - 'A']++;
            
            maxFreq = Math.max(maxFreq, charCounts[rightChar - 'A']);

            int currentWindowSize = right - left + 1;
            int charactersToReplace = currentWindowSize - maxFreq;

            if (charactersToReplace > k) {
                char leftChar = s.charAt(left);
                charCounts[leftChar - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
