package br.com.olx.leadIntegration.facebook;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"title","link"})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName="listings")
public class listings implements Serializable{
	private static final long serialVersionUID = 1L;

	private String title;
	
	private link link;

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<listing> listing;

	public listings() {
		super();
	}

	public listings(String title, link link, List<br.com.olx.leadIntegration.facebook.listing> listing) {
		super();
		this.title = title;
		this.link = link;
		this.listing = listing;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public link getLink() {
		return link;
	}

	public void setLink(link link) {
		this.link = link;
	}

	public List<listing> getListing() {
		return listing;
	}

	public void setListing(List<listing> listing) {
		this.listing = listing;
	}
}
