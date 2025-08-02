package skill;
import java.util.Scanner;
public class replacemodify {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();
	        System.out.println("Replace 'a' with 'x': " + s.replace('a', 'x'));         
	        System.out.println("Replace \"ab\" with \"xy\": " + s.replace("ab", "xy"));     
	        System.out.println("ReplaceAll \"a.\" with \"z\": " + s.replaceAll("a.", "z"));    
	        System.out.println("ReplaceFirst \"ab\" with \"xy\": " + s.replaceFirst("ab", "xy")); 
	        scanner.close();
	    }
	}
