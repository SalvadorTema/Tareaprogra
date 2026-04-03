package Ejercicios;

public class Curso {

    // Atributos 
	private String nombreCurso;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Curso(String nombreCurso, double n1, double n2, double n3) {
		this.nombreCurso = nombreCurso;
		
		// Validacion de notas
		this.nota1 = (n1 >= 0 && n1 <= 100) ? n1 : 0;
     	this.nota2 = (n2 >= 0 && n2 <= 100) ? n2 : 0;
     	this.nota3 = (n3 >= 0 && n3 <= 100) ? n3 : 0;			
	}
   // Metodo para calcular promedio
	public double  promedio() {
		return (nota1+ nota2+ nota3) / 3;
	}
    // Metodo si el promedio es igual o mayor
	public String estado(){
	if (promedio() >= 61) {
	return "Aprobado";
	}else {
	return "Reprobado";
	
	}
	}

    // Para mostra los resultados 
    public void mostrarResultados () {
	System.out.println("Curso:"+ nombreCurso);
	System.out.println("Promedio: " + String.format("%.2f", promedio()));
	System.out.println ("Estado: " + estado());
    System.out.println("---");

}
}