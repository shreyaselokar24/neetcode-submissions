class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            map.put(current,map.getOrDefault(current,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char current=t.charAt(i);
            map.put(current,map.getOrDefault(current,0)-1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}