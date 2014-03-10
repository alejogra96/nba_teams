package com.agr.entity.player;

import java.io.Serializable;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "player")
public class Player implements Serializable {

	/** serial */
	private static final long serialVersionUID = -3467811825329161181L;
	
	@Id
	private ObjectId id;
	
	private String teamId;
	private String name;
	private String lastName;
	private Integer age;
	private PlayerPositionEnum position;
	
	public Player() {}
	
	public String getTeamId(){
		return teamId;
	}
	public void setTeamId(String teamId){
		this.teamId = teamId;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public PlayerPositionEnum getPosition() {
		return position;
	}

	public void setPosition(PlayerPositionEnum position) {
		this.position = position;
	}
	
}


