package entities;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("===Extarto Conta Poupanca===");
		super.imprimirInfosComuns();
	}
}
