class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ch=st.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=ch[ch.length-1-i])
            return false;
        }
        return true;
    }
}
