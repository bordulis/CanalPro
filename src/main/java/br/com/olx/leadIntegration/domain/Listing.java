package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.Objects;

import br.com.olx.leadIntegration.domain.enums.PublicacaoTipo;
import br.com.olx.leadIntegration.domain.enums.TransacaoTipo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;


@JsonPropertyOrder({"ListingID","Title","TransactionType","Location","Media","ContactInfo","PublicationType","Details"})
public class Listing implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ListingID;
	
	@JacksonXmlCData
	private String Title;
	
	private Integer TransactionType;
	
	private Location Location;
	
	private Media Media;
	
	private ContactInfo ContactInfo;
	
	private Integer PublicationType;
	
	private Details Details;

	public Listing() {
		super();
	}

	public Listing(String listingID, String title, TransacaoTipo tipo, Location location, Media media, ContactInfo contactInfo,
					PublicacaoTipo publicacaoTipo, Details details) {
		super();
		ListingID = listingID;
		Title = title;
		this.TransactionType = tipo.getCodigo();
		this.Location = location;
		this.Media = media; 
		this.ContactInfo = contactInfo;
		this.PublicationType = publicacaoTipo.getCodigo();
		this.Details = details;
	}

	@JsonProperty("ListingID")
	public String getListingID() {
		return ListingID;
	}

	public void setListingID(String listingID) {
		ListingID = listingID;
	}

	@JsonProperty("Title")
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	@JsonProperty("TransactionType")
	public String getTransactionType() {
		return TransacaoTipo.toEnum(TransactionType).getDescricao();
	}

	public void setTransactionType(TransacaoTipo tipo) {
		this.TransactionType = tipo.getCodigo();
	}

	@JsonProperty("PublicationType")
	public String getPublicationType() {
		return PublicacaoTipo.toEnum(PublicationType).getDescricao();
	}

	public void setTPublicationType(PublicacaoTipo tipo) {
		this.PublicationType = tipo.getCodigo();
	}

	@JsonProperty("Location")
	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}

	@JsonProperty("Media")
	public Media getMedia() {
		return Media;
	}

	public void setMedia(Media media) {
		Media = media;
	}

	@JsonProperty("ContactInfo")
	public ContactInfo getContactInfo() {
		return ContactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		ContactInfo = contactInfo;
	}

	@JsonProperty("Details")
	public Details getDetails() {
		return Details;
	}

	public void setDetails(Details details) {
		Details = details;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ListingID, Title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Listing other = (Listing) obj;
		return Objects.equals(ListingID, other.ListingID) && Objects.equals(Title, other.Title);
	}
}
