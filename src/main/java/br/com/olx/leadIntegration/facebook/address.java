package br.com.olx.leadIntegration.facebook;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class address implements Serializable{
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(isAttribute = true)
	private String format;
	
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<component> component;

	public address() {
		super();
	}

	public address(String format, List<br.com.olx.leadIntegration.facebook.component> component) {
		super();
		this.format = format;
		this.component = component;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public List<component> getComponent() {
		return component;
	}

	public void setComponent(List<component> component) {
		this.component = component;
	}
}
