package mini_project;
import java.util.Scanner;
public class BankingApp {
	
		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		User user=new User(sc);
		Accounts accounts= new Accounts(sc);
		AccountManager accManager = new AccountManager(sc);
		user.register();
		}
