import java.util.Scanner;

class NumberSwapper {
    private int first;
    private int second;

    public void getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        second = scanner.nextInt();
    }

    public void swapNumbers() {
        System.out.println("Before swapping: First = " + first + ", Second = " + second);

        // Using XOR bitwise operator to swap numbers without using a temporary variable
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping: First = " + first + ", Second = " + second);
    }

    public static void main(String[] args) {
        NumberSwapper numberSwapper = new NumberSwapper();
        numberSwapper.getNumbers();
        numberSwapper.swapNumbers();
    }
}

