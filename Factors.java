class Factors {
    public static void main(String args[]) {

        int n = 100;
        int count = 0;

        if (n <= 0) {
            System.out.println("Invalid");
        } else {

            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }

            System.out.println("Factors = " + count);
        }
    }
}