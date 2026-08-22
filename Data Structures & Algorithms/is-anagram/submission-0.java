class Solution {
    public boolean isAnagram(String s, String t) {

        //two hashmaps for two different strings
        HashMap<Character , Integer> smap = new HashMap<>();
        HashMap<Character , Integer> tmap = new HashMap<>();

        for(char ch : s.toCharArray()){//traveres through each character of string s
            smap.put(ch , smap.getOrDefault(ch , 0)+1);//calculate the frequency of each character
        }
        for(char ch : t.toCharArray()){//traverse through each character of string t
            tmap.put(ch , tmap.getOrDefault(ch , 0)+1);//calculate the frequency of each character
        }

        if(smap.equals(tmap)){
            return true;
        }
        return false;
    }
}
