package br.com.olx.leadIntegration.facebook;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class link implements Serializable{
	private static final long serialVersionUID = 1L;

    @JacksonXmlProperty(isAttribute = true)
	private String rel;

    @JacksonXmlProperty(isAttribute = true)
	private String href;

	public link() {
		super();
		this.rel = "self";
		this.href = "https://bordulis.com";
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
}
