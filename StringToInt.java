class StringToInt {
    public static void main(String args[]) {

        String s = "1234";
        int num = 0;
        boolean valid = true;

        int i = 0;

        if (s.charAt(0) == '-') {
            i = 1;
        }

        for (; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else {
                valid = false;
                break;
            }
        }

        if (valid) {
            if (s.charAt(0) == '-')
                num = -num;
            System.out.println(num);
        } else
            System.out.println("Invalid String");
    }
}