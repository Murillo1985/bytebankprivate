
public class TestGetAndSet {
		public static void main(String[] args) {
			Account account = new Account( 1337, 24226);
			System.out.println(account.getNumber());
			
			Client murillo = new Client();
			
			murillo.setName("Murillo Cruz Alves");
			
			account.setHolder(murillo);
			
			System.out.println(account.getHolder().getName());
			
			account.getHolder().setProfession("Programmer");
			
			Client holderClient = account.getHolder();
			holderClient.setProfession("Programmer");
			
			System.out.println(holderClient);
			System.out.println(murillo);
			System.out.println(account.getHolder());
			
			System.out.println(account.getHolder().getProfession());
		}
}
