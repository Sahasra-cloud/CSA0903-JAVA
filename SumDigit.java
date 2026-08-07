class SumDigit {
    public static void main(String args[]) {

        int n = 936;

        while (n >= 10) {

            int sum = 0;

            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            n = sum;
        }

        System.out.println("Single Digit Sum = " + n);
    }
}