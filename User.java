package BMS;
import java.util.Scanner;
public class User {
private Scanner scanner;
public User(Scanner scanner)
{
	this.scanner=scanner;
}
public void rgister()
{
	System.out.println("Full name:");
	String Full_name = scanner.nextLine();
	System.out.println("Email:");
	String email = scanner.nextLine();
	System.out.println("Password:");
	String password = scanner.nextLine();
}
public String login() {
	System.out.println("Email :");
	String email=scanner.nextLine();
	System.out.println("Password ");
	String password = scanner.nextLine();
	return null;
}
}


	


