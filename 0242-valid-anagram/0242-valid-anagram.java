import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(mapS.get(s.charAt(i)) == null){
                mapS.put(s.charAt(i), 1);
            }else{
                mapS.put(s.charAt(i),mapS.get(s.charAt(i)) + 1);
            }
            if(mapT.get(t.charAt(i)) == null){
                mapT.put(t.charAt(i), 1);
            }else{
                mapT.put(t.charAt(i),mapT.get(t.charAt(i)) + 1);
            }
        }
        if(mapS.equals(mapT)){
            return true;
        }else{
            return false;
        }
    }
}