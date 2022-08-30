package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"Header","Listings"})
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName="ListingDataFeed")
public class ListingDataFeed implements Serializable{
	private static final long serialVersionUID = 1L;

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "http://www.vivareal.com/schemas/1.0/VRSync";

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:xsi")
    private final String xsi = "http://www.w3.org/2001/XMLSchema-instance";

    @JacksonXmlProperty(isAttribute = true, localName = "xmlns:schemaLocation")
    private final String schemaLocation = "http://www.vivareal.com/schemas/1.0/VRSync";

	private Header Header;

	private Listings Listings;

	public ListingDataFeed() {
		super();
	}

	public ListingDataFeed(Header Header, Listings Listings) {
		super();
		this.Header = Header;
		this.Listings = Listings;
	}

	@JsonProperty("Header")
	public Header getHeader() {
		return Header;
	}

	public void setHeader(Header Header) {
		this.Header = Header;
	}

	@JsonProperty("Listings")
	public Listings getListings() {
		return Listings;
	}

	public void setListings(Listings Listings) {
		this.Listings = Listings;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Header, Listings);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListingDataFeed other = (ListingDataFeed) obj;
		return Objects.equals(Header, other.Header) && Objects.equals(Listings, other.Listings);
	}
}
