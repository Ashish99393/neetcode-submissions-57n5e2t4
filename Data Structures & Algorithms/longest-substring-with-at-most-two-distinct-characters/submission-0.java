class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
       int left = 0, maxLen = 0;
    Map<Character, Integer> counts = new HashMap<>();
    for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    counts.put(c, counts.getOrDefault(c, 0) + 1);
    
    while (counts.size() > 2) {
        char leftChar = s.charAt(left);
counts.put(leftChar, counts.get(leftChar) - 1);
if (counts.get(leftChar) == 0) {
    counts.remove(leftChar);
}
left++;
    }
    maxLen = Math.max(maxLen, right - left + 1);
}   
        return maxLen;
    }
}