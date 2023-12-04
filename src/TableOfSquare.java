public class TableOfSquare {
    public static void main(String[] args) {

        // Print the table header
        System.out.printf("%-10s%-10s%-10s%n", "Number", "Square", "Cube");


        for (int number = 0; number <= 10; number++){
            int square = number * number;
            int cube = number * number * number;

            //print value in table format
            System.out.printf("%-10d%-10d%-10d%n", number, square, cube);

        }
    }
}
