package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="Listings")
public class Listings implements Serializable{
	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(localName = "Listing")
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<Listing> listings = new ArrayList<>();

	public Listings() {
		super();
	}

	public Listings(List<Listing> listings) {
		super();
		this.listings = listings;
	}

	public List<Listing> getListings() {
		return listings;
	}

	public void setListings(List<Listing> listings) {
		this.listings = listings;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listings);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Listings other = (Listings) obj;
		return Objects.equals(listings, other.listings);
	}
}
