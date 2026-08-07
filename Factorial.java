class Factorial {
    public static void main(String args[]) {

        int n = 4;
        int fact = 1;

        if (n < 0) {
            System.out.println("Factorial not possible");
        } else {
            for (int i = 1; i <= n; i++)
                fact = fact * i;

            System.out.println("Factorial = " + fact);
        }
    }
}