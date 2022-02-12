package dailycodingproblem.maxoftwonoifs;

public class Main {
  public static void main(String[] args) {
    System.out.println(max(1, 3));
  }

  private static int max(int a, int b) {
    int difference = a - b;
    // Shift the 32 bit integer 31 bits (two's complement) to get the sign of the difference (positive or negative number)
    // then ANDing the result so we can get either 1 (if negative) or 0 (if positive) to avoid comparison
    int sign = (difference >> 31) & 0x1;
    // if a < b: sign == 1; sign * difference == difference == a - b
    // if a >= b: sign == 0; sign * difference == 0
    return a - sign * difference;
  }
}
