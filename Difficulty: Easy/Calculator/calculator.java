class Solution {
    public static void utility(int a, int b, int operator) {
        if (operator == 1) {
            System.out.print(String.valueOf(a + b));
        } else if (operator == 2) {
            System.out.print(String.valueOf(a - b));
        } else if (operator == 3) {
            System.out.print(String.valueOf(a * b));
        } else {
            System.out.print("Invalid Input");
        }
    }
}
