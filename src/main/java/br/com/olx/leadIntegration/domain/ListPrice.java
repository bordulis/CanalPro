package br.com.olx.leadIntegration.domain;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JacksonXmlRootElement(localName = "ListPrice")
public class ListPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(isAttribute = true)
	private String currency;

	@JacksonXmlText(value = true)
	private Integer value;

	public ListPrice() {
		super();
	}

	public ListPrice(Integer value, String currency) {
		super();
		this.value = value;
		this.currency = currency;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
