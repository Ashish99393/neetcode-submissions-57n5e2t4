class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        System.gc();
        return arr[arr.length-1].length();
    }
}