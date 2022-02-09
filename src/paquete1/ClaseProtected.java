package paquete1;

// tus variables deben ser protected y tus métodos public por lo de encapsulamiento
//protected es usado para la herencia
//en este caso ClaseProtected se vuelve el padre y Main la clase hija
//protected funciona con sub clases llamadas clases hijas

public class ClaseProtected {
	//atributo
	private int edad;
	
	//getters y setters//accesos directos a las variables, para modificar sus valores o leerlos
	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
