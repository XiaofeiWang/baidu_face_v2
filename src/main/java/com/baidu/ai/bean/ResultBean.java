package com.baidu.ai.bean;

import java.io.Serializable;
import java.util.List;

public class ResultBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -368951332830678587L;

	
	private LocationBean location;
    private double face_probability;
    private int rotation_angle;
    private double yaw;
    private double pitch;
    private double roll;
    private double age;
    private double beauty;
    private int expression;
    private double expression_probablity;
    private String gender;
    private double gender_probability;
    private int glasses;
    private double glasses_probability;
    private String race;
    private double race_probability;
    private QualitiesBean qualities;
    private List<LandmarkBean> landmark;
    private List<Landmark72Bean> landmark72;
    private List<FaceshapeBean> faceshape;
	public LocationBean getLocation() {
		return location;
	}
	public void setLocation(LocationBean location) {
		this.location = location;
	}
	public double getFace_probability() {
		return face_probability;
	}
	public void setFace_probability(double face_probability) {
		this.face_probability = face_probability;
	}
	public int getRotation_angle() {
		return rotation_angle;
	}
	public void setRotation_angle(int rotation_angle) {
		this.rotation_angle = rotation_angle;
	}
	public double getYaw() {
		return yaw;
	}
	public void setYaw(double yaw) {
		this.yaw = yaw;
	}
	public double getPitch() {
		return pitch;
	}
	public void setPitch(double pitch) {
		this.pitch = pitch;
	}
	public double getRoll() {
		return roll;
	}
	public void setRoll(double roll) {
		this.roll = roll;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getBeauty() {
		return beauty;
	}
	public void setBeauty(double beauty) {
		this.beauty = beauty;
	}
	public int getExpression() {
		return expression;
	}
	public void setExpression(int expression) {
		this.expression = expression;
	}
	public double getExpression_probablity() {
		return expression_probablity;
	}
	public void setExpression_probablity(double expression_probablity) {
		this.expression_probablity = expression_probablity;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getGender_probability() {
		return gender_probability;
	}
	public void setGender_probability(double gender_probability) {
		this.gender_probability = gender_probability;
	}
	public int getGlasses() {
		return glasses;
	}
	public void setGlasses(int glasses) {
		this.glasses = glasses;
	}
	public double getGlasses_probability() {
		return glasses_probability;
	}
	public void setGlasses_probability(double glasses_probability) {
		this.glasses_probability = glasses_probability;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public double getRace_probability() {
		return race_probability;
	}
	public void setRace_probability(double race_probability) {
		this.race_probability = race_probability;
	}
	public QualitiesBean getQualities() {
		return qualities;
	}
	public void setQualities(QualitiesBean qualities) {
		this.qualities = qualities;
	}
	public List<LandmarkBean> getLandmark() {
		return landmark;
	}
	public void setLandmark(List<LandmarkBean> landmark) {
		this.landmark = landmark;
	}
	public List<Landmark72Bean> getLandmark72() {
		return landmark72;
	}
	public void setLandmark72(List<Landmark72Bean> landmark72) {
		this.landmark72 = landmark72;
	}
	public List<FaceshapeBean> getFaceshape() {
		return faceshape;
	}
	public void setFaceshape(List<FaceshapeBean> faceshape) {
		this.faceshape = faceshape;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    
    
    
    
    
}
