package com.plantplaces.dto;

public class SpecimenDTO {
private int specimenID;
private String latitude;
private String langitude;
private String description;

public int getSpecimenID() {
	return specimenID;
}
public void setSpecimenID(int specimenID) {
	this.specimenID = specimenID;
}
public String getLatitude() {
	return latitude;
}
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
public String getLangitude() {
	return langitude;
}
public void setLangitude(String langitude) {
	this.langitude = langitude;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenID + " " + latitude + " " + langitude + " " + description;
	}
}
