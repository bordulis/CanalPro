package br.com.olx.leadIntegration.domain.enums;

public enum TipoPropriedadeBordulis {

	CASA(1, "Casa"),
	APARTAMENTO(2, "Apartamento"),
	COMERCIAL(3, "Comercial"),
	TERRENO(4, "Terreno"),
	RURAL(5, "Rural");

	private int codigo;
	private String descricao;
	
	private TipoPropriedadeBordulis(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static TipoPropriedadeBordulis toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoPropriedadeBordulis x : TipoPropriedadeBordulis.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
