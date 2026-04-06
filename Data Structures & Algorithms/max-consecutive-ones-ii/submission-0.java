class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right=0,left=0,numsZero=0,max=0;

        while(right<nums.length){

            if(nums[right]==0){
                numsZero++;
            }

            while(numsZero==2){
                if(nums[left]==0){
                    numsZero--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
