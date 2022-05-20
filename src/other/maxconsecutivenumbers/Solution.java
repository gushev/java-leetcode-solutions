package other.maxconsecutivenumbers;

public class Solution {
  public static int[] findMaxDuplicateNumbers(int[] input) {
    if (input.length == 0) {
      throw new IllegalArgumentException("Input cannot be empty");
    }

    int returnCount = 0;
    int returnNumber = 0;
    int count = 0;
    int number = 0;

    for(int i = 0; i < input.length; i++) {
      int currentNumber = input[i];
      if (currentNumber == number) {
        count++;
      } else {
        number = currentNumber;
        count = 1;
      }
      if (count > returnCount) {
        returnNumber = number;
        returnCount = count;
      }
    }

    return new int[]{returnNumber, returnCount};
  }
}
