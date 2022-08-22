package br.com.olx.leadIntegration.domain.enums;

public enum MostrarEndereco {

	NEIGHBORHOOD(1, "Neighborhood"),
	STREET(2, "Street"),
	ALL(3, "All");

	private int codigo;
	private String descricao;
	
	private MostrarEndereco(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static MostrarEndereco toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (MostrarEndereco x : MostrarEndereco.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
