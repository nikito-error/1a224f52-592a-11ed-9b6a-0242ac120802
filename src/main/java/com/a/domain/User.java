package com.a.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="user_name")
public class User {
	@Id
    @JsonProperty("ID")
	private String ID;
	@JsonProperty("Message")
	private String message;
	@JsonProperty("Global")
	private Global global;
	@ElementCollection
	@JsonProperty("Countries")
	private List<Countries> contry;
	@Column(nullable=false,insertable=false, updatable=false)
	@JsonProperty("Date")
	private String date;
	
	public User() {
		
	}
	
}
