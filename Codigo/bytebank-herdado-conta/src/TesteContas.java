
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);

		cc.transfere(10, cp);

		System.out.println("Conta corrente: " + cc.getSaldo());
		System.out.println("Conta poupan�a: " + cp.getSaldo());

	}

}
