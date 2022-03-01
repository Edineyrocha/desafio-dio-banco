package pacotebanco;

public class Main {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();

		ContaPoupanca cp = new ContaPoupanca();

		cc.depositar(100);
		cc.imprimirsaldo();
		cc.sacar(50);
		cc.imprimirsaldo();
		
		System.out.println("-------dados da conta poupança--------");

		cp.depositar(200);
		cp.imprimirsaldo();
		cp.sacar(80);
		cp.imprimirsaldo();

	}

}
