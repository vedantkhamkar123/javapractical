package Assignment;
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String add = "N";
        String product1 = "";
        String[] prod = new String[4];
        int[] pri = new int[4];
        int i = 1;
        int j = 0;
        int count = 0;
        do {
            System.out.println("Enter product " + i);
            product1 = scanner.nextLine();
            prod[j] = product1;
            j++;
            System.out.println("Do you Want to add more [Y/N]:- ");
            add = scanner.nextLine();
            i++;

        }
        while (add.equalsIgnoreCase("Y"));
        System.out.println("length-----" + prod.length);
        int price = 0;
        for (int k = 0; k < prod.length; k++) {
            System.out.println("Enter price for " + prod[k]);
            price = scanner.nextInt();
            pri[k] = price;


        }
        System.out.print("Do you want to add GST? (Y/N): ");
        char choice = scanner.next().charAt(0);
        double gstPercentage;
        if (choice == 'Y' || choice == 'y') {
            System.out.print("Enter GST % = ");
            gstPercentage = scanner.nextDouble();

        } else if (choice == 'N' || choice == 'n') {
            System.out.println("No GST will be added to your bill.");
        } else {
            System.out.println("Invalid choice. Please enter Y or N.");
        }


        System.out.print("Enter GST % = ");
        gstPercentage = scanner.nextDouble();

        do {

            System.out.println("-------------------");
            System.out.println("Total = ");
            System.out.println("GST = " + gstPercentage + "%");
            System.out.println("-------------------");
            System.out.println("Final Total = ");
            System.out.println("-------------------");



            if (choice == 'N' || choice == 'n') {
                System.out.println("No GST will be added.");
                break;
            } else if (choice == 'Y' || choice == 'y') {
                System.out.print("Enter new GST % (or 0 to exit): ");
                gstPercentage = scanner.nextDouble();
            } else {
                System.out.println("Invalid choice. Please enter Y or N.");
            }
        } while (gstPercentage != 0);

        System.out.println("Thank you for using our program!");
        scanner.close();
    }
}




