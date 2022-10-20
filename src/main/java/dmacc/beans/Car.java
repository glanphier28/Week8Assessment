/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author gabel
 *
 */
@Entity
public class Car {
	@Id
	@GeneratedValue
	private long id;
	private String make;
	private String model;
	private String color;
	private int year;
	
	
	public Car() {
		super();
		this.make = "Chevy";
	}
	
	public Car(String make) {
		super();
		this.make = make;
	}
	
	public Car(String make, String model, String color, int year) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	public Car(int id, String make, String model, String color, int year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", make=" + make + ", model=" + model +", year=" + year +", color=" + color +"]";
	}
	
	
}
