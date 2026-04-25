class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st=new HashSet<Integer>();
        while(!st.contains(n)){
            st.add(n);
            n=sumOfSquares(n);
            if(n==1) return true;
        }
        return false;
    }

    int sumOfSquares(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
    return sum;
    }
}
