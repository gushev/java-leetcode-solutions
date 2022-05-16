package other.maxconsecutivenumbers;

public class Solution {
  public static int[] findMaxDuplicateNumbers(int[] input) {
    if(input.length == 0) {
      return new int[]{0, 0};
    }

    int resultCounter = 1;
    int resultNumber = input[0];
    int counter = 0;
    int number = 0;

    for(int i = 0; i < input.length; i++) {
      if (number == input[i]) {
        counter++;
      } else {
        if (counter > resultCounter) {
          resultCounter = counter;
          resultNumber = number;
        }
        counter = 1;
        number = input[i];
      }
    }

    return new int[]{resultNumber, resultCounter};
  }
}
