package br.com.olx.leadIntegration.facebook;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class component implements Serializable{
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(isAttribute = true)
	private String name;

	@JacksonXmlText(value = true)
	private String value;

	public component() {
		super();
	}

	public component(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
