
public class TestAccountWithoutClient {
	
	public static void main(String[] args) {
		Account accountOfDaniela = new Account();
		System.out.println(accountOfDaniela.getBalance());
		
		accountOfDaniela.holder = new Client();
		System.out.println(accountOfDaniela.holder);
		
		accountOfDaniela.holder.name = "Daniela";
		System.out.println(accountOfDaniela.holder.name);
	}
}
