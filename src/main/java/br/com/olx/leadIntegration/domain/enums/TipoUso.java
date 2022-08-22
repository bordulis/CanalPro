package br.com.olx.leadIntegration.domain.enums;

public enum TipoUso {

	RESIDENTIAL(1, "Residencial"),
	COMMERCIAL(2, "Comercial"),
	RESIDENTIAL_COMMERCIAL(3, "Residencial e/ou Comercial");

	private int codigo;
	private String descricao;

	private TipoUso(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static TipoUso toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TipoUso x : TipoUso.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
