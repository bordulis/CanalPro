package br.com.olx.leadIntegration.facebook;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class listing implements Serializable{
	private static final long serialVersionUID = 1L;

	private String home_listing_id;
	
	private String name;
	
	private String availability;
	
	private String description;
	
	private address address;
	
	private String latitude;
	
	private String longitude;
	
	private String neighborhood;

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<image> image;
	
	private String listing_type;
	
	private Integer num_baths;
	
	private Integer num_beds;
	
	private String num_units;
	
	private Integer price;
	
	private String property_type;
	
	private String url;
	
	private Integer year_built;

	public listing() {
		super();
	}

	public listing(String home_listing_id, String name, String availability, String description,
			br.com.olx.leadIntegration.facebook.address address, String latitude, String longitude,
			String neighborhood, List<br.com.olx.leadIntegration.facebook.image> image, String listing_type,
			Integer num_baths, Integer num_beds, String num_units, Integer price, String property_type, String url,
			Integer year_built) {
		super();
		this.home_listing_id = home_listing_id;
		this.name = name;
		this.availability = availability;
		this.description = description;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.neighborhood = neighborhood;
		this.image = image;
		this.listing_type = listing_type;
		this.num_baths = num_baths;
		this.num_beds = num_beds;
		this.num_units = num_units;
		this.price = price;
		this.property_type = property_type;
		this.url = url;
		this.year_built = year_built;
	}

	public String getHome_listing_id() {
		return home_listing_id;
	}

	public void setHome_listing_id(String home_listing_id) {
		this.home_listing_id = home_listing_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public List<image> getImage() {
		return image;
	}

	public void setImage(List<image> image) {
		this.image = image;
	}

	public String getListing_type() {
		return listing_type;
	}

	public void setListing_type(String listing_type) {
		this.listing_type = listing_type;
	}

	public Integer getNum_baths() {
		return num_baths;
	}

	public void setNum_baths(Integer num_baths) {
		this.num_baths = num_baths;
	}

	public Integer getNum_beds() {
		return num_beds;
	}

	public void setNum_beds(Integer num_beds) {
		this.num_beds = num_beds;
	}

	public String getNum_units() {
		return num_units;
	}

	public void setNum_units(String num_units) {
		this.num_units = num_units;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getProperty_type() {
		return property_type;
	}

	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getYear_built() {
		return year_built;
	}

	public void setYear_built(Integer year_built) {
		this.year_built = year_built;
	}
}
