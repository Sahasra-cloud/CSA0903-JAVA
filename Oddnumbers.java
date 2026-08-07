class OddNumbers {
    public static void main(String args[]) {

        int n = 7;

        if (n <= 0) {
            System.out.println("Invalid");
        } else {

            for (int i = 1; i <= n; i++) {
                System.out.print((2 * i - 1) + " ");
            }
        }
    }
}