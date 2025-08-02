package skill;
import java.util.Scanner;
public class trimwhitespace {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string with spaces: ");
	        String s = scanner.nextLine();

	        // Trimming the whitespace and printing the result
	        System.out.println("[" + s.trim() + "]");

	        scanner.close();
	    }
	}



