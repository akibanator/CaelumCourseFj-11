package contaFinal;

public class GerenciadorDeImpostoDeRenda {

	private double total;

	public void adiciona(contaFinal.ContaCorrente cc) {
		System.out.println("Adicionando tributavel: " + cc);

		//this.total += cc.calculoTributos();
	}

	public double getTotal() {
		return this.total;
	}

}
