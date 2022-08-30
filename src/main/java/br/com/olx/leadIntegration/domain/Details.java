package br.com.olx.leadIntegration.domain;

import java.io.Serializable;

import br.com.olx.leadIntegration.domain.enums.TipoPropriedade;
import br.com.olx.leadIntegration.domain.enums.TipoUso;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"ListPrice","Description","PropertyType","LivingArea","LotArea","Bathrooms","Bedrooms","Garage",
					"Floors","UsageType"})
public class Details implements Serializable{
	private static final long serialVersionUID = 1L;

	private ListPrice ListPrice;
	
	private String Description;
	
	private Integer PropertyType;
	
	private LivingArea LivingArea;
	
	private LotArea LotArea;
	
	private Integer Bathrooms;
	
	private Integer Bedrooms;
	
	private Integer Garage;
	
	private Integer Floors;
	
	private Integer UsageType;

	public Details() {
		super();
	}

	public Details(ListPrice listPrice, String description, TipoPropriedade propertyType, LivingArea livingArea, LotArea lotArea,
					Integer bathrooms, Integer bedrooms, Integer garage, Integer floors, TipoUso usageType) {
		super();
		ListPrice = listPrice;
		this.Description = description;
		this.PropertyType = propertyType.getCodigo();
		this.LivingArea = livingArea;
		this.LotArea = lotArea;
		this.Bathrooms = bathrooms;
		this.Bedrooms = bedrooms;
		this.Garage = garage;
		this.Floors = floors;
		this.UsageType = usageType.getCodigo();
	}

	@JsonProperty("ListPrice")
	public ListPrice getListPrice() {
		return ListPrice;
	}

	public void setListPrice(ListPrice listPrice) {
		ListPrice = listPrice;
	}

	@JsonProperty("Description")
	public String getDescription() {
		if (this.Description != null) {
			if (this.Description.length() < 50) {
				String desc_2 = "" + this.Description == null ? "" : this.Description;
				
				do {
					desc_2 += " ";
				} while (desc_2.length() < 500);
				
				return desc_2;
			}
			else {
				if (this.Description.length() > 3000) {
					return this.Description.substring(0, 3000);
				}
				return Description;
			}			
		}
		else {
			String desc_2 = "" + this.Description == null ? "" : this.Description;
			
			do {
				desc_2 += "Sem descrição Sem descrição";
			} while (desc_2.length() < 50);
			
			return desc_2;
		}
	}

	public void setDescription(String description) {
		Description = description;
	}

	@JsonProperty("PropertyType")
	public String getPropertyType() {
		if (this.PropertyType != null) {
			return TipoPropriedade.toEnum(PropertyType).getDescricao();
		}
		else {
			return null;
		}
	}

	public void setPropertyType(TipoUso tipoPropriedade) {
		this.PropertyType = tipoPropriedade.getCodigo();
	}

	@JsonProperty("UsageType")
	public String getUsageType() {
		if (this.UsageType != null) {
			return TipoUso.toEnum(UsageType).getDescricao();
		}
		else {
			return null;
		}
	}

	public void setUsageType(TipoUso tipoUso) {
		this.UsageType = tipoUso.getCodigo();
	}

	@JsonProperty("LivingArea")
	public LivingArea getLivingArea() {
		return LivingArea;
	}

	public void setLivingArea(LivingArea livingArea) {
		LivingArea = livingArea;
	}

	@JsonProperty("LotArea")
	public LotArea getLotArea() {
		return LotArea;
	}

	public void setLotArea(LotArea lotArea) {
		LotArea = lotArea;
	}

	@JsonProperty("Bathrooms")
	public Integer getBathrooms() {
		return Bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		Bathrooms = bathrooms;
	}

	@JsonProperty("Bedrooms")
	public Integer getBedrooms() {
		return Bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		Bedrooms = bedrooms;
	}

	@JsonProperty("Garage")
	public Integer getGarage() {
		return Garage;
	}

	public void setGarage(Integer garage) {
		Garage = garage;
	}

	@JsonProperty("Floors")
	public Integer getFloors() {
		return Floors;
	}

	public void setFloors(Integer floors) {
		Floors = floors;
	}
}
