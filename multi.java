package Assignment;
import java.util.Scanner;
public class multi {
    public static void main(String[] args) {

    int[][] data = new int[3][3];

    data[0][0] = 23;
    data[0][1] = 24;
    data[0][2] = 25;

    data[1][0] = 26;
    data[1][1] = 27;
    data[1][2] = 28;

    data[2][0] = 29;
    data[2][1] = 30;
    data[2][2] = 31;


    //System.out.println(data[2][2]);

            for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data.length; j++) {
            System.out.print("  "+data[i] [j]);
        }
        System.out.println();
    }



}

}

        /*
        Scanner sc = new Scanner(System.in);

        int row,col;

        System.out.println("Enter col number : \n");
        col = sc.nextInt();
        System.out.println("Enter row number : \n");
        row = sc.nextInt();

        int[][] data = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print("Enter row and col - \n");
                data[i][j] = sc.nextInt();

            }

            System.out.println();
        }

        System.out.println("-------------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(" "+data[i][j]);


            }

            System.out.println();
        }



    }


}
*/