package xadrez;

public enum Pecas {

		PEAO_BRANCO(1, "Peão"),
		BISPO_BRANCO(2, "Bispo"),
		CAVALO_BRANCO(3, "Cavalo"),
		TORRE_BRANCA(4, "Torre"),
		RAINHA_BRANCA(5, "Rainha"),
		REI_BRANCO(6, "Rei"),
		
		PEAO_PRETO(1, "Peão"),
		BISPO_PRETO(2, "Bispo"),
		CAVALO_PRETO(3, "Cavalo"),
		TORRE_PRETA(4, "Torre"),
		RAINHA_PRETA(5, "Rainha"),
		REI_PRETO(6, "Rei");
	
		private Integer valor;
		private String descricao;
		
		Pecas(Integer valor, String descricao) {
			this.valor = valor;
			this.descricao = descricao;
		}
		
		public Integer getValor() {
			return this.valor;
		}
		public String getDescricao() {
			return this.descricao;
		}
}
