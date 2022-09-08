package br.com.olx.leadIntegration.domain.enums;

public enum TipoInformacaoBairro {

	CEP(1, "CEP"),
	LATITUDE(2, "LATITUDE"),
	LONGITUDE(3, "LONGITUDE");
	
	private int codigo;
	private String descricao;

	private TipoInformacaoBairro(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static TipoInformacaoBairro toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoInformacaoBairro x : TipoInformacaoBairro.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
