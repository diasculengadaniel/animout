package com.example.model;

public class SessionDataAttribute{
	private String contentType;
	
	private String categoryAnime[]={"Ação","Aventura"};
	
	private String categoryBooks[]={"Científicos","Romance"};
	
	public SessionDataAttribute(String contentType){
		this.contentType = contentType;
	}
	
	public String getContentType(){return this.contentType;}
	
	public String[] getCategory(){
		if(this.contentType.equals("Anime"))
			return this.categoryAnime;
		return this.categoryBooks;
	}
}