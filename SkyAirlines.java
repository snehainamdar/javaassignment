import java.util.Scanner;

class SkyAirlines {
    private String customerName;
    private String source;

    public void getCustomerInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        customerName = scanner.nextLine();

        System.out.println("Enter source: ");
        source = scanner.nextLine();

        System.out.println("Enter destination: ");
        source = scanner.nextLine();
    }

    public void printMessage() {
        System.out.print("Dear " + customerName + ",");
        System.out.print("Welcome onborard with service from dubai to chicago.");
        System.out.print("Thank you for choosing Sky Airlines.");
        System.out.print("Enjoye your flight.");
    }



    public static void main(String[] args) {
        SkyAirlines skyAirlines = new SkyAirlines();
        skyAirlines.getCustomerInput();
        skyAirlines.printMessage();
    }
}
