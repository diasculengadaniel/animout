package com.example.model;

public class CadastModel{
	private String name;
	private String lastName;
	private String userName;
	
	public CadastModel(String name, String lastName, String userName){
		this.name     = name;
		this.lastName = lastName;
		this.userName = userName;
	}
	
	public String getName(){return this.name;}
	public String getLastName(){return this.lastName;}
	public String getUserName(){return this.userName.toLowerCase();}
	
	public String getCompName(){
		String compName= this.name +" "+ this.lastName;
		return compName;
	}
}