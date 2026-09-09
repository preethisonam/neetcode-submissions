class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
   
   Map<String,List<String>> map = new HashMap<>();

        for(String st:strs){
             int[] count = new int[26];
           
            for(char ch:st.toCharArray()){
                  count[ch -'a']++;

             }
             String key =Arrays.toString(count);
             map.putIfAbsent(key,new ArrayList<>());
             map.get(key).add(st);

        }
    return new ArrayList<>(map.values());

    }
    
}
