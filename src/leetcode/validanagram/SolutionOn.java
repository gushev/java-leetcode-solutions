package leetcode.validanagram;

public class SolutionOn {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) {
            int currentChar = t.charAt(i) - 'a';
            alphabet[currentChar]--;
            if(alphabet[currentChar] < 0) return false;
        }
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
