package br.com.olx.leadIntegration.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"Name","Email","Website","Logo","OfficeName","Telephone","Location"})
public class ContactInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String Name;

	private String Email;

	private String Website;

	private String Logo;

	private String OfficeName;

	private String Telephone;

	private Location Location;

	public ContactInfo() {
		super();
	}

	public ContactInfo(String name, String email, String website, String logo, String officeName, String telephone, Location location) {
		super();
		Name = name;
		Email = email;
		Website = website;
		Logo = logo;
		OfficeName = officeName;
		Telephone = telephone;
		Location = location;
	}

	@JsonProperty("Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@JsonProperty("Email")
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@JsonProperty("Website")
	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	@JsonProperty("Logo")
	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}

	@JsonProperty("OfficeName")
	public String getOfficeName() {
		return OfficeName;
	}

	public void setOfficeName(String officeName) {
		OfficeName = officeName;
	}

	@JsonProperty("Telephone")
	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	@JsonProperty("Location")
	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}
}
