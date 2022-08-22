package br.com.olx.leadIntegration.domain.enums;

public enum PublicacaoTipo {

	STANDARD(1, "STANDARD"),
	PREMIUM(2, "PREMIUM"),
	SUPER_PREMIUM(3, "SUPER_PREMIUM");
	
	private int codigo;
	private String descricao;

	private PublicacaoTipo(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static PublicacaoTipo toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (PublicacaoTipo x : PublicacaoTipo.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
