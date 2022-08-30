package br.com.olx.leadIntegration.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder({"name","email","website","logo","officeName","telephone","location"})
@JacksonXmlRootElement(localName = "ContactInfo")
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

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}

	public String getOfficeName() {
		return OfficeName;
	}

	public void setOfficeName(String officeName) {
		OfficeName = officeName;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}
}
