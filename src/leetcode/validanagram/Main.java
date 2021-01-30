package leetcode.validanagram;

public class Main {
    public static void main(String[] args) {
        SolutionOn solution = new SolutionOn();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "cat"));
    }
}
