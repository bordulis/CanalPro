package br.com.olx.leadIntegration.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "mod_districts")
public class ModDistricts implements Serializable {
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

	@Column(name = "title")
	private String Titulo;

	@Column(name = "local")
	private String Local;

	public ModDistricts() {
		super();
	}

	public ModDistricts(Integer id, Integer ativo, Date dataCriacao, Date dataAlteracao, String titulo, String local) {
		super();
		Id = id;
		Ativo = ativo;
		DataCriacao = dataCriacao;
		DataAlteracao = dataAlteracao;
		Titulo = titulo;
		Local = local;
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

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Ativo == null) ? 0 : Ativo.hashCode());
		result = prime * result + ((DataAlteracao == null) ? 0 : DataAlteracao.hashCode());
		result = prime * result + ((DataCriacao == null) ? 0 : DataCriacao.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Local == null) ? 0 : Local.hashCode());
		result = prime * result + ((Titulo == null) ? 0 : Titulo.hashCode());
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
		ModDistricts other = (ModDistricts) obj;
		if (Ativo == null) {
			if (other.Ativo != null)
				return false;
		} else if (!Ativo.equals(other.Ativo))
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
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Local == null) {
			if (other.Local != null)
				return false;
		} else if (!Local.equals(other.Local))
			return false;
		if (Titulo == null) {
			if (other.Titulo != null)
				return false;
		} else if (!Titulo.equals(other.Titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ModDistricts [Id=" + Id + ", Ativo=" + Ativo + ", DataCriacao=" + DataCriacao + ", DataAlteracao="
				+ DataAlteracao + ", Titulo=" + Titulo + ", Local=" + Local + "]";
	}
}
