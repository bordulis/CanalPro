package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.Objects;

import br.com.olx.leadIntegration.domain.enums.PublicacaoTipo;
import br.com.olx.leadIntegration.domain.enums.TransacaoTipo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JsonPropertyOrder({"listingID","title","transactionType","location","media","contactInfo","publicationType","details"})
@JacksonXmlRootElement(localName = "Listing")
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

	public String getListingID() {
		return ListingID;
	}

	public void setListingID(String listingID) {
		ListingID = listingID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getTransactionType() {
		return TransacaoTipo.toEnum(TransactionType).getDescricao();
	}

	public void setTransactionType(TransacaoTipo tipo) {
		this.TransactionType = tipo.getCodigo();
	}

	public String getPublicationType() {
		return PublicacaoTipo.toEnum(PublicationType).getDescricao();
	}

	public void setTPublicationType(PublicacaoTipo tipo) {
		this.PublicationType = tipo.getCodigo();
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}

	public Media getMedia() {
		return Media;
	}

	public void setMedia(Media media) {
		Media = media;
	}

	public ContactInfo getContactInfo() {
		return ContactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		ContactInfo = contactInfo;
	}

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
