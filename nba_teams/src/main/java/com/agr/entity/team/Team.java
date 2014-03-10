package com.agr.entity.team;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document (collection = "Team")
public class Team implements Serializable{

	
	/** serial id*/
	private static final long serialVersionUID = 2027006500260456951L;
	
	@Id
	private ObjectId id;
	private String teamName;
	private String cityName;
	private TeamConferenceEnum conference;
	
	public Team() {}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public TeamConferenceEnum getConference() {
		return conference;
	}

	public void setConference(TeamConferenceEnum conference) {
		this.conference = conference;
	}

}








	
	
			
		
		
	



