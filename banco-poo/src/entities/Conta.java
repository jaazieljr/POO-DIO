package entities;

public abstract class Conta implements IConta{
	private static int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 0;

	
		protected int agencia;
		protected int numeroConta;
		protected double saldo;
		protected Cliente cliente;
		
		public Conta(Cliente cliente) {
			this.agencia = AGENCIA_PADRAO;
			this.numeroConta = SEQUENCIAL++;
			this.cliente = cliente;
		}
		@Override
		public void depositar(double valor) {
			saldo +=valor;
			
		}

		@Override
		public void sacar(double valor) {
			
			saldo -=valor;
		}

		@Override
		public void transferir(double valor, Conta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		public int getAgencia() {
			return agencia;
		}

		public int getNumeroConta() {
			return numeroConta;
		}

		public double getSaldo() {
			return saldo;
		}

		protected void imprimirInfosComuns() {
			System.out.println(String.format("Agencia %d", this.agencia));
			System.out.println(String.format("C.C. %d", this.numeroConta));
			System.out.println("Nome: "+ this.cliente.getNome());
			System.out.println(String.format("Saldo %.2f", this.saldo));
			System.out.println("_____________________________\n");
		}

	}
