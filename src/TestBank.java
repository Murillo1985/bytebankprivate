
public class TestBank {
	
	public static void main(String[] args) {
		Client murillo = new Client();
		murillo.name = "Murillo Alves";
		murillo.cpf = "333.333.333-33";
		murillo.profession = "programmer";
		
		Account accountOfMurillo = new Account();
		accountOfMurillo.deposits(100);
		
		accountOfMurillo.holder = murillo;
		System.out.println(accountOfMurillo.holder.name);
		System.out.println(accountOfMurillo.holder);
		System.out.println(murillo);
		
	}
}
