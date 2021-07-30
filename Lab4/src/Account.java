/* Programming Fundamentals
 * Summer 2021
 * Name: Noelle Falk
 * LAB 4 */

public class Account {
	private static int numAccounts = 0;
	
	public static void main(String[] args) {
		Account acct1 = new Account(); 
		Account acct2 = new Account();
		Account acct3 = new Account();
		System.out.print(acct2.getNumAccounts());
	}
	
	public Account() {
		numAccounts++;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}
}
