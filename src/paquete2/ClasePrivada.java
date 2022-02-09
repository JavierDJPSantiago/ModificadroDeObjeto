package paquete2;


public class ClasePrivada {
	//atributos
	public String nombre;
	public int edad;
	
	/*
	private String nombre;//
	provate int edad;//solo puedes accedera a ellas desde las clases que se crearon
	*/
	
	//metodos
	public void setSaludar(String nombre) { //fijando el valor de la variable con Set
		this.nombre = nombre;
		
	}
	
	
	
	//usando get para que nos devuelava el valor de la variable
	public String getSaludar() {
		return this.nombre;//reurn para que lo regrese/con this para que apunte al parametro de afuera 
	}

	
	
	
}





//consjeos presiona control sobre una variable para saber su origen o relacionado
