import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Cliente> listaPessoas = new ArrayList<>();
		Cliente beyonce = new Cliente();
		beyonce.setNome("Beyoncé Knowles");
		listaPessoas.add(beyonce);
		Cliente ladygaga = new Cliente();
		ladygaga.setNome("Lady Gaga");
		listaPessoas.add(ladygaga);
		
		
		Conta cc = new ContaCorrente(beyonce);
		Conta poupanca = new ContaPoupanca(ladygaga);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		//Listar Clientes
		System.out.println(listaPessoas);
	}

}