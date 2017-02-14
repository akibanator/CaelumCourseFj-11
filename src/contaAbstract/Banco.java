package contaAbstract;

public class Banco {
	
	private Conta[] contas;
	
	private int cont;
	
	public Banco(int numContas) {
		contas = new Conta[numContas];
	}
	
	public void adiciona(Conta c) {
		contas[cont] = c;
		cont++;
	}
	
	public Conta pegaConta(int x) {
		return contas[x];
	}
	
	public int pegaTotalDeContas() {
		int total = 0;
		for (Conta c : contas) {
			total++;
		}
		return total;
	}

}
