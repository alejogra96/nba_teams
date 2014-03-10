package com.agr.entity.team;

public enum TeamConferenceEnum {
	
	WEST("west"), EAST("east");

	private String conference;

	private TeamConferenceEnum(String conference) {
		this.conference = conference;
	}

	public String getConference() {
		return conference;
	}

}
