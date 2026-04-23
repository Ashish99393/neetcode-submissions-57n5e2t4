class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;

        // int i=0;
        // int j=n-1;
        int currMax=arr[n-1];
        arr[n-1]=-1;
        for(int j=n-2;j>=0;j--){
            if(arr[j]>currMax){
                int temp=arr[j];
                arr[j]=currMax;
                currMax=temp;
            } else if(arr[j]<=currMax){
                arr[j]=currMax;
            }
        }
        return arr;
    }
}