package com.isoft.mto.vo;

public class Country {

	private int country_id;
	private String country;
//	private 
	public Country(int id,String country){
		this.country=country;
		this.country_id=id;
		
	}
	public String toString(){
		return this.country_id+"--"+this.country+"\n";
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry() {
		return country;
	}
	public int getCountry_id() {
		return country_id;
	}
	
}
