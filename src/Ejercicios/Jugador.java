package Ejercicios;

public class Jugador {
	//Atributos 
	private String nombre;
	private int puntajeActual;
	private int puntajeMaximo;
	
	//Contructor
	
	public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0; 
        this.puntajeMaximo = 0; 
    }

    // Método para actualizar puntaje 
	
    public void actualizarPuntaje(int nuevoPuntaje) {
        // Validar que el puntaje no sea negativo
        if (nuevoPuntaje >= 0) {
            this.puntajeActual = nuevoPuntaje;
            System.out.println("Puntaje de la partida: " + nuevoPuntaje);

            // Si el nuevo puntaje supera al récord, se actualiza el máximo
            if (nuevoPuntaje > puntajeMaximo) {
                this.puntajeMaximo = nuevoPuntaje;
                System.out.println("Nuevo record pesronal");
            }
        } else {
            System.out.println("Error: El puntaje no puede ser negativo.");
        }
    }

    // Método para mostrar el estado del jugador
    public void mostrarEstadisticas() {
        System.out.println("--- JUGADOR: " + nombre + " ---");
        System.out.println("Puntaje Actual: " + puntajeActual);
        System.out.println("Récord (Puntaje Máximo): " + puntajeMaximo);
        
}
	
}
