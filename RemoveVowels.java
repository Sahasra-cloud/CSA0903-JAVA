class RemoveVowels {
    public static void main(String args[]) {

        String s = "we can play the game";

        System.out.print("String without vowels: ");

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.print(s.charAt(i));
            }
        }
    }
}