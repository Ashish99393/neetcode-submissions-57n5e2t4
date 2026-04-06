class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
    for(String s: strs){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String sort=new String(ch);
        res.putIfAbsent(sort,new ArrayList<>());
        res.get(sort).add(s);
        
    }
       return new ArrayList<>(res.values());
    }
}
