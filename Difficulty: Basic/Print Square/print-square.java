class Solution {
    public static void square(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                // Print "*" for the border cells
                if (i == 0 || i == s - 1 || j == 0 || j == s - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space inside the square
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
