package br.com.olx.leadIntegration.domain.enums;

public enum TransacaoTipo {

	FOR_SALE(1, "For Sale"),
	FOR_RENT(2, "For Rent"),
	SALE_RENT(3, "Sale/Rent");
	
	private int codigo;
	private String descricao;

	private TransacaoTipo(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	public static TransacaoTipo toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TransacaoTipo x : TransacaoTipo.values()) {
			
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id iválido:" + cod);
	}
}
