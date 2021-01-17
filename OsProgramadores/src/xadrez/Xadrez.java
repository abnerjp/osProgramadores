package xadrez;

public class Xadrez {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		
		try {
			tabuleiro.adicionarPeca(Pecas.RAINHA_BRANCA, 5, 3);
			tabuleiro.adicionarPeca(Pecas.RAINHA_BRANCA, 3, 3);
			tabuleiro.adicionarPeca(Pecas.RAINHA_BRANCA, 3, 2);
		}
		catch (IllegalArgumentException e) {
			System.out.println("erro " + e.getMessage());
		}
		tabuleiro.exibirTabuleiro();
		System.out.println("----------");
		tabuleiro.exibirPecas();

	}

}
