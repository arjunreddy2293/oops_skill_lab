package skill;
import java.util.Scanner;

public class substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine(); 
        System.out.print("Enter the starting index for substring(start): ");
        int start = scanner.nextInt();
        System.out.print("Enter the starting index for substring(start, end): ");
        int start2 = scanner.nextInt();

        System.out.print("Enter the ending index for substring(start, end): ");
        int end2 = scanner.nextInt();

        if (start >= 0 && start < s.length()) {
            System.out.println("substring(" + start + "): " + s.substring(start));
        } else {
            System.out.println("Invalid starting index for substring(start).");
        }

        if (start2 >= 0 && end2 <= s.length() && start2 < end2) {
            System.out.println("substring(" + start2 + ", " + end2 + "): " + s.substring(start2, end2));
        } else {
            System.out.println("Invalid range for substring(start, end).");
        }

        scanner.close();
    }
}
