package leetcode.twosum;

public class Main {
  public static void main(String[] args) {
    FastSolution solution = new FastSolution();
    int [] result = solution.twoSum(new int[] {1,3,5,6}, 11);
    System.out.println(result[0] + " and " + result[1]);
  }
}
