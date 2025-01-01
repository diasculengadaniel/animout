/*Esta class é meio zuada, foi criada apenas para teste*/
package com.example.model;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AnimeListAttribute implements HttpSessionBindingListener{
	private int numAnim;
	private int numMaxAnim;
	
	String animList[]={"Naruto","GragonBall Z","Shigenki no Koujin","Rakudai",
					   "Tensei Slime", "Arlans Senki"};
					   
	public AnimeListAttribute(String numList){
		this.numMaxAnim = Integer.parseInt(numList);
		this.numAnim = 0;
	}
	
	public String getAnime(){
		if(this.numAnim < this.numMaxAnim){
			this.numAnim++;
			return animList[this.numAnim];
		}
		return " ";
	}
	
	/*Métodos da interface HttpSessionBindingAttribute*/
	@Override
	public void valueBound(HttpSessionBindingEvent ev){
		this.numAnim = 0;/*Para que o getAnime começar sempre no primeiro anime
		pois este é um atributo de contexto.*/
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent ev){}
}
