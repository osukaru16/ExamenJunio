package org.meeseeks.clases;

import java.util.ArrayList;

public class ProxyMrMeeseeks {
	private MrMeeseeks mrMe;

	public ProxyMrMeeseeks(){
		
	}
	
	
	public MrMeeseeks getMrMe(){
		return this.mrMe;
	}
	
	public void pushButton(ArrayList <MrMeeseeks> listaMrMeeseeks){
		createMrMeeseeks(listaMrMeeseeks);
		listaMrMeeseeks.add(this.mrMe);
		
	}
	
	public void createMrMeeseeks(ArrayList <MrMeeseeks> listaMrMeeseeks){
		this.mrMe = new MrMeeseeks();
		//this.mrMe.sayMessageOnCreate();
	}
	
	
	
	
	
	
	
}
