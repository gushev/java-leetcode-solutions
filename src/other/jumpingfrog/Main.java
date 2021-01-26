package other.jumpingfrog;

public class Main {
    public static void main(String[] args) {
        System.out.println(jumpFeet(4));
    }

    public static int jumpFeet(int feet) {
        if (feet <= 2) return feet;
        return jumpFeet(feet - 1) + jumpFeet(feet - 2);
    }
}
