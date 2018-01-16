package org.sukriti.oustlab.studentapi.dao;



public class Student {
	
	private String Name;
    private String Mobile;
    private String City;
	private String Country;
	private int Id;
	
	public Student()
	{}
	
	public Student(String Name, String Mobile, String City, String Country, int Id) {
		this.Name = Name;
		this.Mobile = Mobile;
		this.City = City;
		this.Country = Country;
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String Mobile) {
		this.Mobile = Mobile;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String Country) {
		this.Country = Country;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	

}
