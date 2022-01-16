package model;

import database.Segreteria;

public class Impiegato {
	private String name;
	private String surname;
	private String id;
	private int yearOfBirth;
	private int salary;
	
	public Impiegato(String name, String surname, int yearOfBirth, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;
		this.salary = salary;
		setId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSur52name() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId() {
		this.id = Segreteria.createID(name,surname,yearOfBirth);
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Impiegato [name=" + name + ", surname=" + surname + ", id=" + id + ", yearOfBirth=" + yearOfBirth
				+ ", salary=" + salary + "]";
	}
	
	
	
}
