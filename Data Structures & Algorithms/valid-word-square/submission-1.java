class Solution {
    public boolean validWordSquare(List<String> words) {
        int n=words.size();
        int c=0;
        String st="";
        for(String word: words){
            st="";
            for(int i=0;i<n;i++){
                if (c >= words.get(i).length()) break;
                char ch=words.get(i).charAt(c);
                st=st+ch;
            }
            if(!st.equals(word))
            return false;
            c++;
        }
        return true;
    }
}
