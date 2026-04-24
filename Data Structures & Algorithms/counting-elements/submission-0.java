class Solution {
    public int countElements(int[] arr) {
        Set<Integer> st=new HashSet<>();

        for(int x:arr){
            st.add(x);
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i]+1)){
                c++;
            }
        }
        return c;
    }
}
