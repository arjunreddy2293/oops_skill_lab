package skill;
import java.util.Scanner;
public class caseconversion {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();
	        System.out.println("Uppercase: " + s.toUpperCase());
	        System.out.println("Lowercase: " + s.toLowerCase());
	      scanner.close();
	    }
	}


