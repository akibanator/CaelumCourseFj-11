package exCasa;

public class Casa {

	String cor;
	int totalDePortas;
	Porta[] portas;
	int cont = 0;

	void pinta(String s) {
		this.cor = s;
		System.out.println("A casa foi pintada para: " + s);
	}

	int quantasPortasEstaoAbertas() {
		int qntPortasAbertas = 0;
		//verifica quantas portas estão abertas no momento
		for (int i = 0; i < cont; i++) {
			if (portas[i].aberta) {
				qntPortasAbertas++;
			}
		}
		return qntPortasAbertas;
	}

	void adicionaPorta(Porta p) {
		//verifica se da pra colocar mais portas. +5 nao pode
		if (cont > 5) {
			System.out.println("Nao e possivel adicionar mais portas");
		} else {
			//adiciona a porta no array
			this.portas[cont] = p;
			cont++;
			System.out.println("Porta adicionada");
		}
	}

	int totalDePortas() {
		return cont;
	}

}
