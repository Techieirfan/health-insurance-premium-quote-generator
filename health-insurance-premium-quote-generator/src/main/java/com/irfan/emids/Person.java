package com.irfan.emids;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3233234886099460698L;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Gender=" + gender + ", age=" + age + ", hyperTension="
				+ hyperTension + ", bloodpressure=" + bloodpressure + ", sugar=" + sugar + ", overweight=" + overweight
				+ ", smoking=" + smoking + ", alochol=" + alochol + ", exercise=" + exercise + ", drugs=" + drugs + "]";
	}

	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	private String gender;
	private int age;
	private boolean hyperTension;
	private boolean bloodpressure;
	private boolean sugar;
	private boolean overweight;
	private boolean smoking;
	private boolean alochol;
	
	private boolean exercise;
	private boolean drugs;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHyperTension() {
		return hyperTension;
	}

	public void setHyperTension(boolean hyperTension) {
		this.hyperTension = hyperTension;
	}

	public boolean isBloodpressure() {
		return bloodpressure;
	}

	public void setBloodpressure(boolean bloodpressure) {
		this.bloodpressure = bloodpressure;
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isOverweight() {
		return overweight;
	}

	public void setOverweight(boolean overweight) {
		this.overweight = overweight;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isAlochol() {
		return alochol;
	}

	public void setAlochol(boolean alochol) {
		this.alochol = alochol;
	}

	public boolean isExercise() {
		return exercise;
	}

	public void setExercise(boolean exercise) {
		this.exercise = exercise;
	}

	public boolean isDrugs() {
		return drugs;
	}

	public void setDrugs(boolean drugs) {
		this.drugs = drugs;
	}

	


	

	
	

}
