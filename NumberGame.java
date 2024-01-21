import java.util.Scanner;

class NumberGame {
    private int num1;
    private int num2;
    private int num3;

    public void getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
    }

    public void findSmallestNumber() {
        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallest);
        }
    }



    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        numberGame.getNumbers();
        numberGame.findSmallestNumber();
    }
}
