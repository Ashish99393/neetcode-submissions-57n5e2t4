class Solution {
    public int largestUniqueNumber(int[] nums) {
        
        int[] freqMap=new int[10001];

        for(int num:nums){
            freqMap[num]++;
        }
        for(int i=1000;i>=0;i--){
            if(freqMap[i]==1) return i;
        }
        return -1;
    }
}
