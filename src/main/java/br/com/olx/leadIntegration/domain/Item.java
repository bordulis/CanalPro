package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "Item")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(isAttribute = true)
	private String medium;

	@JacksonXmlProperty(isAttribute = true)
	private String caption;

	@JacksonXmlProperty(isAttribute = true)
	private String primary;

	@JacksonXmlText(value = true)
	private String url;

	public Item() {
		super();
	}

	public Item(String medium, String caption, String primary, String url) {
		super();
		this.medium = medium;
		this.caption = caption;
		this.primary = primary;
		this.url = url;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getCaption() {
		if (this.medium == "image") {
			return this.caption;
		}
		else {
			return null;
		}
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getPrimary() {
		if (this.primary == "true" && this.medium == "image") {
			return "true";
		}
		else {
			return null;
		}
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caption, medium, primary, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(caption, other.caption) && Objects.equals(medium, other.medium)
				&& Objects.equals(primary, other.primary) && Objects.equals(url, other.url);
	}
}
