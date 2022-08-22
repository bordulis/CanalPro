package br.com.olx.leadIntegration.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;


@JacksonXmlRootElement(localName = "State")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(isAttribute = true)
	private String abbreviation;

	@JacksonXmlText(value = true)
	private String value;

	public State() {
		super();
	}

	public State(String abbreviation, String value) {
		super();
		this.abbreviation = abbreviation;
		this.value = value;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abbreviation, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(abbreviation, other.abbreviation) && Objects.equals(value, other.value);
	}
}
