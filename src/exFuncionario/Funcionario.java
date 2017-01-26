package exFuncionario;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;

	void bonifica(double aumento) {
		salario += aumento;
	}

	void demite() {
		estaNaEmpresa = false;
	}

	double calculaGanhoAnual() {
		double ganhoAnual = 0;

		ganhoAnual = 12 * salario;

		return ganhoAnual;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.rg);
		System.out.println("Esta na empresa: " + this.estaNaEmpresa);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}

}
