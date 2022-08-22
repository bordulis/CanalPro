package br.com.olx.leadIntegration.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "mod_properties")
public class ModProperties implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer Id;

	@Column(name = "active")
	private Integer Ativo;

	@Column(name = "createdat")
	private Date DataCriacao;

	@Column(name = "alteredat")
	private Date DataAlteracao;

	@Column(name = "code")
	private String Code;

	@Column(name = "business")
	private String Business;

	@Column(name = "price")
	private Integer Preco;

	@Column(name = "type")
	private Integer Tipo;

	@Column(name = "district")
	private Integer ModDistrict;

	@Column(name = "infraestructure")
	private String InfraEstrutura;

	@Column(name = "feature")
	private Integer feature;

	@Column(name = "parking_lots")
	private Integer Garagem;

	@Column(name = "rooms")
	private Integer Quarto;

	@Column(name = "terrain_footage")
	private Integer Terreno;

	@Column(name = "building_area")
	private Integer AreaConstruida;

	@Column(name = "local")
	private String Local;

	@Column(name = "video")
	private String Video;

	@Column(name = "text")
	private String Decricao;

	@Column(name = "img")
	private String Imagem;

	@Column(name = "observations")
	private String Observacao;

	@Column(name = "sold")
	private Integer Vendido;

	public ModProperties() {
		super();
	}

	public ModProperties(Integer id, Integer ativo, Date dataCriacao, Date dataAlteracao, String code, String business,
			Integer preco, Integer tipo, Integer modDistrict, String infraEstrutura, Integer feature,
			Integer garagem, Integer quarto, Integer terreno, Integer areaConstruida, String local, String video,
			String decricao, String imagem, String observacao, Integer vendido) {
		super();
		Id = id;
		Ativo = ativo;
		DataCriacao = dataCriacao;
		DataAlteracao = dataAlteracao;
		Code = code;
		Business = business;
		Preco = preco;
		Tipo = tipo;
		ModDistrict = modDistrict;
		InfraEstrutura = infraEstrutura;
		this.feature = feature;
		Garagem = garagem;
		Quarto = quarto;
		Terreno = terreno;
		AreaConstruida = areaConstruida;
		Local = local;
		Video = video;
		Decricao = decricao;
		Imagem = imagem;
		Observacao = observacao;
		Vendido = vendido;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getAtivo() {
		return Ativo;
	}

	public void setAtivo(Integer ativo) {
		Ativo = ativo;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}

	public Date getDataAlteracao() {
		return DataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		DataAlteracao = dataAlteracao;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getBusiness() {
		return Business;
	}

	public void setBusiness(String business) {
		Business = business;
	}

	public Integer getPreco() {
		return Preco;
	}

	public void setPreco(Integer preco) {
		Preco = preco;
	}

	public Integer getTipo() {
		return Tipo;
	}

	public void setTipo(Integer tipo) {
		Tipo = tipo;
	}

	public Integer getModDistrict() {
		return ModDistrict;
	}

	public void setModDistrict(Integer modDistrict) {
		ModDistrict = modDistrict;
	}

	public String getInfraEstrutura() {
		return InfraEstrutura;
	}

	public void setInfraEstrutura(String infraEstrutura) {
		InfraEstrutura = infraEstrutura;
	}

	public Integer getFeature() {
		return feature;
	}

	public void setFeature(Integer feature) {
		this.feature = feature;
	}

	public Integer getGaragem() {
		return Garagem;
	}

	public void setGaragem(Integer garagem) {
		Garagem = garagem;
	}

	public Integer getQuarto() {
		return Quarto;
	}

	public void setQuarto(Integer quarto) {
		Quarto = quarto;
	}

	public Integer getTerreno() {
		return Terreno;
	}

	public void setTerreno(Integer terreno) {
		Terreno = terreno;
	}

	public Integer getAreaConstruida() {
		return AreaConstruida;
	}

	public void setAreaConstruida(Integer areaConstruida) {
		AreaConstruida = areaConstruida;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	public String getVideo() {
		return Video;
	}

	public void setVideo(String video) {
		Video = video;
	}

	public String getDecricao() {
		return Decricao;
	}

	public void setDecricao(String decricao) {
		Decricao = decricao;
	}

	public String getImagem() {
		return Imagem;
	}

	public void setImagem(String imagem) {
		Imagem = imagem;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public Integer getVendido() {
		return Vendido;
	}

	public void setVendido(Integer vendido) {
		Vendido = vendido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AreaConstruida == null) ? 0 : AreaConstruida.hashCode());
		result = prime * result + ((Ativo == null) ? 0 : Ativo.hashCode());
		result = prime * result + ((Business == null) ? 0 : Business.hashCode());
		result = prime * result + ((Code == null) ? 0 : Code.hashCode());
		result = prime * result + ((DataAlteracao == null) ? 0 : DataAlteracao.hashCode());
		result = prime * result + ((DataCriacao == null) ? 0 : DataCriacao.hashCode());
		result = prime * result + ((Decricao == null) ? 0 : Decricao.hashCode());
		result = prime * result + ((Garagem == null) ? 0 : Garagem.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Imagem == null) ? 0 : Imagem.hashCode());
		result = prime * result + ((InfraEstrutura == null) ? 0 : InfraEstrutura.hashCode());
		result = prime * result + ((Local == null) ? 0 : Local.hashCode());
		result = prime * result + ((ModDistrict == null) ? 0 : ModDistrict.hashCode());
		result = prime * result + ((Observacao == null) ? 0 : Observacao.hashCode());
		result = prime * result + ((Preco == null) ? 0 : Preco.hashCode());
		result = prime * result + ((Quarto == null) ? 0 : Quarto.hashCode());
		result = prime * result + ((Terreno == null) ? 0 : Terreno.hashCode());
		result = prime * result + ((Tipo == null) ? 0 : Tipo.hashCode());
		result = prime * result + ((Vendido == null) ? 0 : Vendido.hashCode());
		result = prime * result + ((Video == null) ? 0 : Video.hashCode());
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModProperties other = (ModProperties) obj;
		if (AreaConstruida == null) {
			if (other.AreaConstruida != null)
				return false;
		} else if (!AreaConstruida.equals(other.AreaConstruida))
			return false;
		if (Ativo == null) {
			if (other.Ativo != null)
				return false;
		} else if (!Ativo.equals(other.Ativo))
			return false;
		if (Business == null) {
			if (other.Business != null)
				return false;
		} else if (!Business.equals(other.Business))
			return false;
		if (Code == null) {
			if (other.Code != null)
				return false;
		} else if (!Code.equals(other.Code))
			return false;
		if (DataAlteracao == null) {
			if (other.DataAlteracao != null)
				return false;
		} else if (!DataAlteracao.equals(other.DataAlteracao))
			return false;
		if (DataCriacao == null) {
			if (other.DataCriacao != null)
				return false;
		} else if (!DataCriacao.equals(other.DataCriacao))
			return false;
		if (Decricao == null) {
			if (other.Decricao != null)
				return false;
		} else if (!Decricao.equals(other.Decricao))
			return false;
		if (Garagem == null) {
			if (other.Garagem != null)
				return false;
		} else if (!Garagem.equals(other.Garagem))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Imagem == null) {
			if (other.Imagem != null)
				return false;
		} else if (!Imagem.equals(other.Imagem))
			return false;
		if (InfraEstrutura == null) {
			if (other.InfraEstrutura != null)
				return false;
		} else if (!InfraEstrutura.equals(other.InfraEstrutura))
			return false;
		if (Local == null) {
			if (other.Local != null)
				return false;
		} else if (!Local.equals(other.Local))
			return false;
		if (ModDistrict == null) {
			if (other.ModDistrict != null)
				return false;
		} else if (!ModDistrict.equals(other.ModDistrict))
			return false;
		if (Observacao == null) {
			if (other.Observacao != null)
				return false;
		} else if (!Observacao.equals(other.Observacao))
			return false;
		if (Preco == null) {
			if (other.Preco != null)
				return false;
		} else if (!Preco.equals(other.Preco))
			return false;
		if (Quarto == null) {
			if (other.Quarto != null)
				return false;
		} else if (!Quarto.equals(other.Quarto))
			return false;
		if (Terreno == null) {
			if (other.Terreno != null)
				return false;
		} else if (!Terreno.equals(other.Terreno))
			return false;
		if (Tipo == null) {
			if (other.Tipo != null)
				return false;
		} else if (!Tipo.equals(other.Tipo))
			return false;
		if (Vendido == null) {
			if (other.Vendido != null)
				return false;
		} else if (!Vendido.equals(other.Vendido))
			return false;
		if (Video == null) {
			if (other.Video != null)
				return false;
		} else if (!Video.equals(other.Video))
			return false;
		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ModProperties [Id=" + Id + ", Ativo=" + Ativo + ", DataCriacao=" + DataCriacao + ", DataAlteracao="
				+ DataAlteracao + ", Code=" + Code + ", Business=" + Business + ", Preco=" + Preco + ", Tipo=" + Tipo
				+ ", ModDistrict=" + ModDistrict + ", InfraEstrutura=" + InfraEstrutura + ", feature=" + feature
				+ ", Garagem=" + Garagem + ", Quarto=" + Quarto + ", Terreno=" + Terreno + ", AreaConstruida="
				+ AreaConstruida + ", Local=" + Local + ", Video=" + Video + ", Decricao=" + Decricao + ", Imagem="
				+ Imagem + ", Observacao=" + Observacao + ", Vendido=" + Vendido + "]";
	}
}
