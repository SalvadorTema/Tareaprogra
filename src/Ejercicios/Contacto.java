package Ejercicios;


public class Contacto {
//Atributos 
	private String nombre;
	private String telefono;
	private String email;
	
	//Constructor
	public Contacto(String nombre, String telefono, String email) {
		this.nombre = nombre;
		setTelefono (telefono);
		setEmail (email);
		
	}
	// Valida que tenga exactamente 8 dígitos
    public void setTelefono(String tel) {
        if (tel != null && tel.length() == 8) {
            this.telefono = tel;
        } else {
            System.out.println("Error: El teléfono '" + tel + "' debe tener exactamente 8 dígitos.");
            this.telefono = "00000000"; 
        }
    }

    //  Valida que contenga el carácter '@'
    public void setEmail(String correo) {
        if (correo != null && correo.contains("@")) {
            this.email = correo;
        } else {
            System.out.println("Error: El email '" + correo + "' debe contener un '@'.");
            this.email = "sin@correo.com"; 
        }
    }

    // Método para mostrar la información en una sola línea
    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre + "  Tel: " + telefono + "  Email: " + email);
    }

    // Getters 
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
}