package pacotebanco;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	

	
	

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
saldo = saldo - valor;
	}

	public void transferir(double valor, Conta contadestino ) {
		sacar(valor);
		contadestino.depositar(valor);
	}
	public void depositar(double valor) {
saldo = saldo + valor;

	}
	public void imprimirsaldo() {
		System.out.println("-------Saldo da conta-------");
		System.out.println(saldo);
		
		
	}

}
