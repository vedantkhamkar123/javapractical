package Assignment;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

/*

        String Instaid[] = new String[4];

        Instaid[0] = "@veduu__k__47";
        Instaid[1] = "@vk_skeches";
        Instaid[2] = "@only_ved_things";
        Instaid[3] = "@sketo_dadar";

        System.out.println("======= INSTAGRAM ID's ==========");

        for (int i = 0; i < Instaid.length; i++) {
            System.out.println((i + 1) + " - " + Instaid[i]);

        }

*/
        /*
        String Product[]=new String[4];

        Product[0]="Samosa";
        Product[1]="Kachori";
        Product[2]="Fafda";
        Product[3]="Jalebi";

        System.out.println("-- User input section --");

        System.out.println("Enter Product List Size :");
        String Productno = scanner.nextLine();

      */
/*
                System.out.print("Enter Product List Size: ");
                int productListSize = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                String[] products = new String[productListSize];
                int[] prices = new int[productListSize];

                for (int i = 0; i < productListSize; i++) {
                    System.out.print("Enter Product " + (i + 1) + " - ");
                    products[i] = scanner.nextLine();

                }

                System.out.print("\nDo You Want to add GST [Y/N]: ");
                char gstChoice = scanner.nextLine().charAt(0);

                int gstPercentage = 0;
                if (gstChoice == 'Y' || gstChoice == 'y') {
                    System.out.print("Enter GST % = ");
                    gstPercentage = scanner.nextInt();
                }

                int total = 0;
                System.out.println("-------Out put -------");
                for (int i = 0; i < productListSize; i++) {
                    System.out.println((i + 1) + ". " + products[i] + " = " + prices[i] + "-");
                    total += prices[i];
                }

                System.out.println("-------------------");
                System.out.println("Total = " + total);

                if (gstPercentage > 0) {
                    int gstAmount = (gstPercentage * total) / 100;
                    System.out.println("GST = " + gstPercentage + "%");
                    System.out.println("-------------------");
                    System.out.println("Final Total = " + (total + gstAmount));
                }

                System.out.println("-------------------");

                scanner.close();
            }
        }

*/


                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();

                int[] array = new int[n];
                System.out.println("Enter the array elements:");

                for (int i = 0; i < n; i++) {
                    array[i] = scanner.nextInt();
                }

                int sum = 0;
                for (int num : array) {
                    sum += num;
                }

                int average = sum / n; // Integer division

                System.out.println("Sum of array elements: " + sum);
                System.out.println("Average of array elements: " + average);

                scanner.close();
            }
        }



   
