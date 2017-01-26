package exFuncionario;

public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] empregados;
	int i = 0;
	int cont = 0;

	void adiciona(Funcionario f) {
		if (i > 10) {
			System.out.println("Cheio");
		} else {
			this.empregados[i] = f;
			i++;
		}
	}

	void mostraEmpregados() {
		for (Funcionario x : empregados) {
			System.out.println("Funcionario na posicao: " + cont);
			// System.out.println("Salario: " + x.salario);
			x.mostra();
			if (this.contem(x)) {
				System.out.println("Está na empresa");
			} else {
				System.out.println("Demitido");
			}
			cont++;
		}
	}

	boolean contem(Funcionario f) {

		if (f.estaNaEmpresa == true) {
			return true;
		}
		return false;

	}

}
