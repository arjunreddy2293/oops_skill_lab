package skill;
import java.util.Scanner;
public class searchindex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();
	        System.out.print("Enter a substring for indexOf(): ");
	        String indexOfSub = scanner.nextLine();
	        System.out.println("indexOf(\"" + indexOfSub + "\"): " + s.indexOf(indexOfSub));
	        System.out.print("Enter a substring for lastIndexOf(): ");
	        String lastIndexOfSub = scanner.nextLine();
	        System.out.println("lastIndexOf(\"" + lastIndexOfSub + "\"): " + s.lastIndexOf(lastIndexOfSub));
	        System.out.print("Enter a substring for contains(): ");
	        String containsSub = scanner.nextLine();
	        System.out.println("contains(\"" + containsSub + "\"): " + s.contains(containsSub));
	        scanner.close();
	    }
	}

