package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Media")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

    @JacksonXmlElementWrapper(useWrapping = false)
	private List<Item> items = new ArrayList<>();

	public Media() {
		super();
	}

	public Media(List<Item> items) {
		super();
		this.items = items;
	}

	@JsonProperty("Item")
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
