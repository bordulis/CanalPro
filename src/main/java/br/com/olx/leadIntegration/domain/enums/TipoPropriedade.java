package br.com.olx.leadIntegration.domain.enums;

public enum TipoPropriedade {

	CASA(1, "Casa"),
	APARTAMENTO(2, "Apartamento"),
	CASA_CONDOMINIO(3, "Casa de Condomínio");

	private int codigo;
	private String descricao;
	
	private TipoPropriedade(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static TipoPropriedade toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoPropriedade x : TipoPropriedade.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
