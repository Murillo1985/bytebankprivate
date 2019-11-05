
public class TestValues {
		public static void main(String[] args) {

			Account account = new Account( 1337, 24226);
						
			System.out.println(account.getAgency());
			
			account.setAgency(1232123);
			
			Account account2 = new Account (1337, 16549);
			Account account3 = new Account (2112, 14660);
			
			System.out.println(Account.getTotal());

		}
}
