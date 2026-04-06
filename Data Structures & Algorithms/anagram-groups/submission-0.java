class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String str: strs)
        {
            char[] st=str.toCharArray();
            Arrays.sort(st);
            String sorted=new String(st);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
