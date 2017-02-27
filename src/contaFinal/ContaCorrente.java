package contaFinal;

public class ContaCorrente extends Conta implements Tributavel {
	public void atualiza(double taxa) {

	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculoTributos() {
		return this.getSaldo() * 0.01;
	}

	public String toString() {
		return "objeto conta corrente";
	}
}
