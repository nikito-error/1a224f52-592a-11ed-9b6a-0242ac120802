package com.a.domain;

import javax.persistence.Embeddable;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Countries {
	@JsonProperty("ID")
	private String id;
	 @JsonProperty("Country")
	private String Country;
	 @JsonProperty("CountryCode")
	private String CountryCode;
	@JsonProperty("Slug")
	private String slug;
	 @JsonProperty("NewConfirmed")
	private long NewConfirmed;
	 @JsonProperty("TotalConfirmed")
	private long TotalConfirmed;
	 @JsonProperty("NewDeaths")
	private long NewDeaths;
	 @JsonProperty("TotalDeaths")
	private long TotalDeaths;
	 @JsonProperty("NewRecovered")
	private long NewRecovered;
	 @JsonProperty("TotalRecovered")
	private long TotalRecovered;
	 @JsonProperty("Date")
	private String date;
	 @JsonProperty("Premium")
	private Premium premium;
	public Countries() {
		
	}
}
