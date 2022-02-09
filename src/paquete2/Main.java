package paquete2;

import paquete1.ClaseDefault;//importamos un paquete, entre clases no hay problema
//queremos accedor a la ClaseDefault pero no me deja porque default esta limitada entre paquetes
//en la ClaseDefault ponemos public: public class ClaseDefault { ahora ya puedo 

//import paquete1.*; //no hagas esto no es buena practica

public class Main extends paquete1.ClaseProtected{
//herencia de la clase padre(unicamente para protected)
//con esto de extends se main se vuelve una sub clase(Clase hija) de ClaseProtected
	
	public static void main (String[] args) {
		//https://javadesdecero.es/poo/modificadores-de-acceso/
		//modificador de acceso para limitar el acceso entre paquetes y clases
		
		ClaseDefault prueba = new ClaseDefault();
		
		prueba.mostrar();//nos dice que el metodo prueba es default  debe ser public
		
		
		ClasePrivada privada = new ClasePrivada();
		//privada.nombre = "Javier";
		//privada.edad = 25;
		privada.setSaludar("Juan");
		
		System.out.println(privada.getSaludar());
		
		
		
		//Objeto de la clase protected;
		Main protegido = new Main();//objeto creado//para que herede main lo de la clase padre
		
		protegido.setEdad(18);
		System.out.println(protegido.getEdad());
		
		
		
		
	}
	
	
}
