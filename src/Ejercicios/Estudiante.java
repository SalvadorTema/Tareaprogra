package Ejercicios;

public class Estudiante {
	//Atributos privados
	private String carnet;
	private String nombre;
	private double promedio;
	
	//Constructor
	public Estudiante(String carnet, String nombre, double promedio) {
		this.carnet = carnet;
		this.nombre = nombre;
		 //Validacion que el promedio este entre 0 y 100
		if (promedio >= 0 && promedio <= 100) {
			this.promedio = promedio;
		} else {
			this.promedio = 0; // Si es invalido se coloca 0
			System.out.println("Error:El promedio ingresado es invalidp. Se asigno 0");	
		}
	}
	
	 //Metodo que retorna true si tiene beca promedio 85
	public boolean esBecado() {
		return this.promedio >= 85;
    }
	//Metodo para mostrar la informacion
	public void mostrarInfo() {
		System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        
     // Usamos un if  para mostrar un mensaje basado en el booleano
        if (esBecado()) {
        	System.out.println("Estado: ¡FELICIDADES, TIENE BECA!");
        } else {
            System.out.println("Estado: No aplica para beca.");
        }
   
        }
	}
	

