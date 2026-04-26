class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        System.out.print(arr[arr.length-1]);
        return arr[arr.length-1].length();
    }
}