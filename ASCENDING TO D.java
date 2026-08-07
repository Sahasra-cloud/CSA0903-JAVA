import java.util.*;

public class NameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("\nChoose Sorting Order:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Arrays.sort(names);

        if (choice == 1) {
            System.out.println("\nNames in Ascending Order:");
            for (String name : names) {
                System.out.println(name);
            }
        } else if (choice == 2) {
            System.out.println("\nNames in Descending Order:");
            for (int i = names.length - 1; i >= 0; i--) {
                System.out.println(names[i]);
            }
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}