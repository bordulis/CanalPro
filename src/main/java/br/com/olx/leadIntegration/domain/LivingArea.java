package br.com.olx.leadIntegration.domain;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;


@JacksonXmlRootElement(localName = "LivingArea")
public class LivingArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(isAttribute = true)
	private String unit;

	@JacksonXmlText(value = true)
	private Integer value;

	public LivingArea() {
		super();
	}

	public LivingArea(String unit, Integer value) {
		super();
		this.unit = unit;
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
