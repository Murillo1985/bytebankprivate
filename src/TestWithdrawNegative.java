
public class TestWithdrawNegative {
		public static void main(String[] args) {
			Account account = new Account();
			account.deposits(100);
			System.out.println(account.withdraw(101));
 			
			account.withdraw(101);
			
			System.out.println(account.getBalance());
		}
}
