
public class Pattern12345{
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (j * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println(); // Move to the next line
        }
    }
}


