class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String , List<String>> res = new HashMap<>();
      for(String s: strs){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String key = new String(charArray);
       if(!res.containsKey(key)){
        res.put(key,new ArrayList<>());
       }
       res.get(key).add(s);
      }
      return new ArrayList<>(res.values());   
    }
}
