package console;


import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Aplication {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		
		
		Conta cc = new ContaCorrente(paulo);
		Conta cp = new ContaPoupanca(paulo);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cc.depositar(10);
		cc.imprimirExtrato();
		cc.transferir(5, cp);
		cp.imprimirExtrato();
		
		
	
		
		
	}

}
