class Solution {
    public int removeDuplicates(int[] nums) {
        
        System.arraycopy(Arrays.stream(nums).distinct().toArray(), 0, nums, 0, Arrays.stream(nums).distinct().toArray().length);
        return Arrays.stream(nums).distinct().toArray().length;
    }
}