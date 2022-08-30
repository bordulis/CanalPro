package br.com.olx.leadIntegration.domain;

import java.io.Serializable;

import br.com.olx.leadIntegration.domain.enums.MostrarEndereco;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"country","state","city","neighborhood","address","postalCode"})
@JacksonXmlRootElement(localName = "Location")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(isAttribute = true)
	private Integer displayAddress;

	private String City;

	private State State;

	private Country Country;

	private String Zone;

	private String Neighborhood;
	
	private String Address;
	
	private String StreetNumber;
	
	private String Complement;
	
	private String PostalCode;
	
	private String Latitude;
	
	private String Longitude;

	public Location() {
		super();
	}

	public Location(MostrarEndereco displayAddress, String city, State State, Country Country, String zone, String neighborhood, String address, String streetNumber, String complement, String postalCode, String latitude, String longitude) {
		super();
		this.displayAddress = displayAddress.getCodigo();
		this.City = city;
		this.State = State;
		this.Country = Country;
		this.Zone = zone;
		this.Neighborhood = neighborhood;
		this.Address = address;
		this.StreetNumber = streetNumber;
		this.Complement = complement;
		this.PostalCode = postalCode;
		this.Latitude = latitude;
		this.Longitude = longitude;
	}

	public Location(Country Country, State State, String city, String neighborhood, String address, String postalCode) {
		super();
		this.City = city;
		this.State = State;
		this.Country = Country;
		this.Neighborhood = neighborhood;
		this.Address = address;
		this.PostalCode = postalCode;
	}

	public Location(MostrarEndereco displayAddress, String city, State State, Country Country, String neighborhood, String postalCode) {
		super();
		this.City = city;
		this.State = State;
		this.Country = Country;
		this.Neighborhood = neighborhood;
		this.PostalCode = postalCode;
	}

	public String getDisplayAddress() {
		if (this.displayAddress != null) {
			return MostrarEndereco.toEnum(displayAddress).getDescricao();
		}
		else {
			return null;
		}
	}

	public void setDisplayAddress(MostrarEndereco displayAddress) {
		this.displayAddress = displayAddress.getCodigo();
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public State getState() {
		return State;
	}

	public void setState(State state) {
		State = state;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country country) {
		Country = country;
	}

	public String getZone() {
		return this.Zone;
	}

	public void setZone(String zone) {
		Zone = zone;
	}

	public String getNeighborhood() {
		return Neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		Neighborhood = neighborhood;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getStreetNumber() {
		return StreetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		StreetNumber = streetNumber;
	}

	public String getComplement() {
		return Complement;
	}

	public void setComplement(String complement) {
		Complement = complement;
	}

	public String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
}
