package leetcode.rangesumquery;

public class Main {
  public static void main(String[] args) {
    NumArray obj = new NumArrayFast(new int[]{-2, 0, 3, -5, 2, -1});
    System.out.println(obj.sumRange(0, 2));
    System.out.println(obj.sumRange(2, 5));
    System.out.println(obj.sumRange(0, 5));
  }
}
