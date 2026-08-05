class Reverse {
    public static void main(String args[]) {

        String word = "hello";
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        System.out.println("Original Word = " + word);
        System.out.println("Reversed Word = " + rev);
    }
}