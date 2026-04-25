class Solution {
    public int removeDuplicates(int[] nums) {
        int[] unique = Arrays.stream(nums).distinct().toArray();
        System.arraycopy(unique, 0, nums, 0, unique.length);
        return unique.length;
    }
}