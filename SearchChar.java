class SearchChar {
    public static void main(String args[]) {

        String s = "I am a programmer";
        char search = 'p';

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == search) {

                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Character Not Found");
    }
}