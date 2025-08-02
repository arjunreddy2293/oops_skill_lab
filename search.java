package skill;
import java.util.Scanner;
public class search {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();
	        System.out.print("Enter the substring to find indexOf(): ");
	        String sub1 = scanner.nextLine();
	        System.out.println("indexOf(\"" + sub1 + "\"): " + s.indexOf(sub1));
	        System.out.print("Enter the substring to find lastIndexOf(): ");
	        String sub2 = scanner.nextLine();
	        System.out.println("lastIndexOf(\"" + sub2 + "\"): " + s.lastIndexOf(sub2));
	        System.out.print("Enter the substring to check contains(): ");
	        String sub3 = scanner.nextLine();
	        System.out.println("contains(\"" + sub3 + "\"): " + s.contains(sub3));
	        scanner.close();
	    }
	}



