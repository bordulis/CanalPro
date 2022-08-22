package br.com.olx.leadIntegration.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Header")
public class Header implements Serializable{
	private static final long serialVersionUID = 1L;

	private String Provider;

	private String Email;

	private String ContactName;

	private Date PublishDate;

	private String Telephone;

	public Header() {
		super();
	}

	public Header(String provider, String email, String contactName, Date publishDate, String telephone) {
		super();
		Provider = provider;
		Email = email;
		ContactName = contactName;
		PublishDate = publishDate;
		Telephone = telephone;
	}

	public String getProvider() {
		return Provider;
	}

	public void setProvider(String provider) {
		Provider = provider;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public Date getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(Date publishDate) {
		PublishDate = publishDate;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ContactName, Email, Provider, PublishDate, Telephone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Header other = (Header) obj;
		return Objects.equals(ContactName, other.ContactName) && Objects.equals(Email, other.Email)
				&& Objects.equals(Provider, other.Provider) && Objects.equals(PublishDate, other.PublishDate)
				&& Objects.equals(Telephone, other.Telephone);
	}
}
