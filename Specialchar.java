class Specialchar {
    public static void main(String args[]) {

        String s = "abc@12#$%";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') ||
                  (ch >= 'a' && ch <= 'z') ||
                  (ch >= '0' && ch <= '9'))) {

                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nCount = " + count);
    }
}