package org.meeseeks.clases;

import java.util.concurrent.atomic.AtomicInteger;

import org.meeseeks.interfaces.Doable;


// cambia el nombre de la clase
public class MrMeeseeks implements Doable{	

	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	private Integer id;
		
	private String[] messageOnRequest ;
	private String messageOnDone="";
	private String messageOnExplode ="";
	
	
	public MrMeeseeks(){
		this.id = ID_GENERATOR.incrementAndGet();
		
		this.messageOnRequest =new String[]{"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};
		this.messageOnDone="All done!";
		this.messageOnExplode ="Pooooof";
		
		
		this.sayMessageOnCreate();
		
	}

	/* generateMessageOnRequest()
	 * elige al azar uno de los tres mensajes
         * que lanza Mr Meeseeks cuando se le formula
	 * la peticion:
	 * "Oooh yeah! Can do!"; "Yes sireee!"; "Oh, yeah! Yes, ma'am!"
         */	
	
	
	public Integer getId(){
		return this.id;
	}
	
	
	
	//mensajes
	
	public void sayMessageOnRequest(){
		System.out.println(generateMessageOnRequest());
	}
	
	
	public void sayMessageOnCreate(){
		System.out.println("I'm Mr Meeseeks "+this.getId()+". Look at meee!");
	}
	
	
	
	public void sayMessageOnExplode(){
		System.out.println(this.messageOnExplode+" "+this.getId());
	}
	
	
	
	
	public void sayMessageOnDone(){
		System.out.println(this.messageOnDone);
	}
	
	

	
	private String generateMessageOnRequest(){
		int numero = (int) (Math.random()*3);
		
		return this.messageOnRequest[numero];
	}

	
	
	
	
	//fin mensajes 4 publicos 1 privado
	
	
	
	
	
	public String formulateRequest(String accion, String objeto){
		this.sayMessageOnRequest();
		
		return doRequest(accion, objeto).toString();
		
	}
	
	
	
	
	
	
	
	
	
	/*
	public String doRequest(String accion, String objeto) {
		// TODO Auto-generated method stub
		return accion+" "+objeto;
	}*/

	
	public Object doRequest(Object accion, Object objeto) {
		// TODO Auto-generated method stub
		
		return accion+" "+objeto;
	}
	
	
	
	
	public void stopExisting(){
		
	}
	
	
	
	
}


