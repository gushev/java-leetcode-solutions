package other.shiftleft;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  static Deque<Integer> list = new LinkedList<>(Arrays.asList(0, 1, 2 ,3 ,4 ,5 ,6, 7, 8, 9, 10));

  public static void main(String[] args) {
    System.out.println(shiftLeft(list, 3));
  }

  private static Deque<Integer> shiftLeft(Deque<Integer> list, int k) {
    if (k <= 0 || k > list.size() - 1) {
      return list;
    }

    Integer first = list.pollFirst();
    list.addLast(first);

    return shiftLeft(list, k - 1);
  }
}
