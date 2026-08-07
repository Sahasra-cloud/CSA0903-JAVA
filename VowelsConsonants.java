class VowelsCconsonants {
    public static void main(String args[]) {

        String s = "Engineering";

        System.out.print("Vowels : ");

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.print(ch + " ");
        }

        System.out.print("\nConsonants : ");

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch>='a' && ch<='z') {

                if (!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                    System.out.print(ch + " ");
            }
        }
    }
}