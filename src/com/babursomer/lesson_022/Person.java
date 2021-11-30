package com.babursomer.lesson_022;

public abstract class Person {
	protected Gender gender;
	protected int age;
	protected long identityNumber;
	protected PersonName name;
	protected Occupation occupation;
	protected int vacantTime;
	protected boolean parkingLotAssigned;
	
	public Person(long identityNumber, Gender gender, String firstName, String lastName) {
		this.gender = gender;
		this.age = 0;
		this.identityNumber = identityNumber;
		this.name = new PersonName(firstName, lastName);
		this.occupation = Occupation.NO_OCCUPATION;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public long getIdentityNumber() {
		return identityNumber;
	}
	
	public PersonName getName() {
		return name;
	}
	
	public Occupation getOccupation() {
		return occupation;
	}
	
	public void setPersonsMiddleName(String middleName) {
		this.name.setMiddleName(middleName);
	}
	
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", identityNumber=" + identityNumber + ", name=" + name
				+ ", occupation=" + occupation + "]";
	}
	
}
