package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Features implements Serializable{
	private static final long serialVersionUID = 1L;

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<String> Feature = new ArrayList<String>();

	public Features() {
		super();
	}

	public Features(List<String> feature) {
		super();
		Feature = feature;
	}

	@JsonProperty("Feature")
	public List<String> getFeature() {
		return Feature;
	}

	public void setFeature(List<String> feature) {
		Feature = feature;
	}
}
