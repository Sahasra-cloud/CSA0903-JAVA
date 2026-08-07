class SquareRoot {
    public static void main(String args[]) {

        int n = 6561;
        int root = 0;

        if (n < 0) {
            System.out.println("No Square Root");
        } else {

            for (int i = 0; i <= n; i++) {

                if (i * i == n) {
                    root = i;
                    break;
                }
            }

            if (root == 0 && n != 0)
                System.out.println("Not a Perfect Square");
            else
                System.out.println("Square Root = " + root + " , -" + root);
        }
    }
}