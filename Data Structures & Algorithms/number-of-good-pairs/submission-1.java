class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        // for (int i = 0; i < nums.length-1; i++) {
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]==nums[i] && i<j){
        //                 c++;
        //         }
        //     }
        // }
        // return c;

        int i = 0;
        int j = i + 1;
    
        int n = nums.length;
        while(i < n - 1){
            if(j < n) {
                if(nums[i] == nums[j]) {
                    c++;
                }
                j++;
            } else {
                i++;
                j=i+1;

            }
        }
        return c;
    }
}