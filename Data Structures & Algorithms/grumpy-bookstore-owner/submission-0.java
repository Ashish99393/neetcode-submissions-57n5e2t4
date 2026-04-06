class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        int n=customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0)
            satisfied+=customers[i];
        }
        int currentWindowgain=satisfied;
        int max=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==1) currentWindowgain+=customers[i];
            if(i>=minutes){
                if(grumpy[i-minutes]==1){
                    currentWindowgain-=customers[i-minutes];
                }
            }
            max=Math.max(max,currentWindowgain);
        }
        return max;
    }

}