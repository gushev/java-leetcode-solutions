package other.reversestring;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Hello world!"));
    }

    private static char[] reverse(String input) {
        char[] output = new char[input.length()];

        for (int i = input.length() - 1; i >= 0; i--) {
            output[input.length() - 1 - i] += input.charAt(i);
        }

        return output;
    }
}
