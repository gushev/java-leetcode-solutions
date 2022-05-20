package other.maxconsecutivenumbers;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solution.findMaxDuplicateNumbers((new int[]{1, 2, 3, 4, 5, 5, 7, 8, 8, 4, 2, 2, 2, 1}))));
    System.out.println(Arrays.toString(Solution.findMaxDuplicateNumbers((new int[]{1}))));
    System.out.println(Arrays.toString(Solution.findMaxDuplicateNumbers((new int[]{1, 2}))));
    System.out.println(Arrays.toString(Solution.findMaxDuplicateNumbers((new int[]{-1, 2, -2, -2}))));
    System.out.println(Arrays.toString(Solution.findMaxDuplicateNumbers((new int[]{0, 0, 0, -2, -2}))));
    System.out.println(Arrays.toString(Solution.findMaxDuplicateNumbers((new int[]{1, 1, 1, 3, -2, -2}))));
    try {
      Solution.findMaxDuplicateNumbers((new int[]{}));
    } catch (IllegalArgumentException e) {
      System.out.println(e);
    }
  }
}
