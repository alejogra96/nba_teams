package com.agr.entity.player;

public enum PlayerPositionEnum {
	
	POINT_GUARD("Point Guard"), SHOOTING_GUARD("Shooting Guard"), SMALL_FORWARD("Small Forward"), POWER_FORWARD("Power forward"), CENTER("Center");
	
	private String positionName;
	
	private PlayerPositionEnum(String positionName){
		this.positionName = positionName;
	}

	public String getPositionName() {
		return positionName;
	}
}
