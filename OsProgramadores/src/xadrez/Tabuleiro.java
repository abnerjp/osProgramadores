package xadrez;

import java.util.HashMap;
import java.util.Map;

public class Tabuleiro {
	
	int[][] tabuleiro = new int[8][8];
	int[] qtde = new int[7];
	
	Map<Pecas, Integer> max_pecas = new HashMap<Pecas, Integer>();
	
	public Tabuleiro() {
		this.maxPecas();
	}
	
	private void maxPecas() {
		this.max_pecas.put(Pecas.PEAO_BRANCO, 8);
		this.max_pecas.put(Pecas.BISPO_BRANCO, 8);
		this.max_pecas.put(Pecas.CAVALO_BRANCO, 8);
		this.max_pecas.put(Pecas.TORRE_BRANCA, 2);
		this.max_pecas.put(Pecas.RAINHA_BRANCA, 1);
		this.max_pecas.put(Pecas.REI_BRANCO, 1);
		
		this.max_pecas.put(Pecas.PEAO_PRETO, 8);
		this.max_pecas.put(Pecas.BISPO_PRETO, 8);
		this.max_pecas.put(Pecas.CAVALO_PRETO, 8);
		this.max_pecas.put(Pecas.TORRE_PRETA, 2);
		this.max_pecas.put(Pecas.RAINHA_PRETA, 1);
		this.max_pecas.put(Pecas.REI_PRETO, 1);
	}

	public boolean adicionarPeca(Pecas peca, int linha, int coluna) throws IllegalArgumentException {
		Integer qtde = this.max_pecas.get(peca);
		
		if (qtde < 1 ) {
			throw new IllegalArgumentException("Já atingiu a quantidade máxima dessa peça no tabuleiro.");
		}
		
		try {
			linha--;
			coluna--;
			if (tabuleiro[linha][coluna] > 0) {
				throw new IllegalArgumentException("Posição não está vazia.");
			}
			tabuleiro[linha][coluna] = peca.getValor();
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException("Posição informada não existe.");
		}
		
		this.qtde[peca.getValor()] = ++this.qtde[peca.getValor()];
		this.max_pecas.put(peca, --qtde);
		return true;
	}
	
	public void exibirTabuleiro() {
		System.out.println("      a  b  c  d  e  f  g  h");
		System.out.print("      |  |  |  |  |  |  |  |\n\n");
		for (int i = 0; i < 8; i++) {
			System.out.print(i + 1 + " -   ");
			for (int j = 0; j < 8; j++) {
				System.out.print(this.tabuleiro[i][j] + "  ");
			}
			System.out.println("");
		}
	}
	
	public void exibirPecas() {
		System.out.println(Pecas.PEAO_PRETO.getDescricao() + ": " + this.qtde[Pecas.PEAO_PRETO.getValor()] + " peça(s)");
		System.out.println(Pecas.BISPO_PRETO.getDescricao() + ": " + this.qtde[Pecas.BISPO_PRETO.getValor()] + " peça(s)");
		System.out.println(Pecas.BISPO_PRETO.getDescricao() + ": " + this.qtde[Pecas.BISPO_PRETO.getValor()] + " peça(s)");
		System.out.println(Pecas.TORRE_PRETA.getDescricao() + ": " + this.qtde[Pecas.TORRE_PRETA.getValor()] + " peça(s)");
		System.out.println(Pecas.RAINHA_PRETA.getDescricao() + ": " + this.qtde[Pecas.RAINHA_PRETA.getValor()] + " peça(s)");
		System.out.println(Pecas.REI_PRETO.getDescricao() + ": " + this.qtde[Pecas.REI_PRETO.getValor()] + " peça(s)");
	}
	
}
