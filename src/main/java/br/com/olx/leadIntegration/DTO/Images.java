package br.com.olx.leadIntegration.DTO;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Images")
public class Images implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer Id;

	@Column(name = "modules_id")
	private Integer ModuloId;

	@Column(name = "modules_fields_id")
	private Integer ModuloFildId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "path")
	private String Url;

	@Column(name = "title")
	private String Titulo;

	@Column(name = "order")
	private Integer Ordem;

	public Images() {
		super();
	}

	public Images(Integer id, Integer moduloId, Integer moduloFildId, Integer itemId, String url, String titulo,
			Integer ordem) {
		super();
		this.Id = id;
		this.ModuloId = moduloId;
		this.ModuloFildId = moduloFildId;
		this.itemId = itemId;
		this.Url = url;
		this.Titulo = titulo;
		this.Ordem = ordem;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getModuloId() {
		return ModuloId;
	}

	public void setModuloId(Integer moduloId) {
		ModuloId = moduloId;
	}

	public Integer getModuloFildId() {
		return ModuloFildId;
	}

	public void setModuloFildId(Integer moduloFildId) {
		ModuloFildId = moduloFildId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public Integer getOrdem() {
		return Ordem;
	}

	public void setOrdem(Integer ordem) {
		Ordem = ordem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((ModuloFildId == null) ? 0 : ModuloFildId.hashCode());
		result = prime * result + ((ModuloId == null) ? 0 : ModuloId.hashCode());
		result = prime * result + ((Ordem == null) ? 0 : Ordem.hashCode());
		result = prime * result + ((Titulo == null) ? 0 : Titulo.hashCode());
		result = prime * result + ((Url == null) ? 0 : Url.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
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
		Images other = (Images) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (ModuloFildId == null) {
			if (other.ModuloFildId != null)
				return false;
		} else if (!ModuloFildId.equals(other.ModuloFildId))
			return false;
		if (ModuloId == null) {
			if (other.ModuloId != null)
				return false;
		} else if (!ModuloId.equals(other.ModuloId))
			return false;
		if (Ordem == null) {
			if (other.Ordem != null)
				return false;
		} else if (!Ordem.equals(other.Ordem))
			return false;
		if (Titulo == null) {
			if (other.Titulo != null)
				return false;
		} else if (!Titulo.equals(other.Titulo))
			return false;
		if (Url == null) {
			if (other.Url != null)
				return false;
		} else if (!Url.equals(other.Url))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		return true;
	}
}
