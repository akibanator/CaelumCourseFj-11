package contaAbstract;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		
		this.total += t.calculoTributos();
	}
	
	public double getTotal() {
		return this.total;
	}
	

}
