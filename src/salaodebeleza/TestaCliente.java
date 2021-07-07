package salaodebeleza;

public class TestaCliente {

	public static void main(String[] args) {

			Salao salao1 = new Salao("Cores e Cortes", 55555555);
			Cliente cliente1 = new Cliente("Bia", "111222333-44", 26, salao1);
			Cabelereira cabelereira1 = new Cabelereira("Maria", "777888999-55", 30, 1500.00);
			
			System.out.println(salao1);
			System.out.println(cliente1);
			System.out.println(cabelereira1);
	}

}
