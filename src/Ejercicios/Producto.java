package Ejercicios;

public class Producto {
    // Atributos
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
   
    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        
    }

    // Validacion de precio
    public void setprecio(double precio) {
    	if (precio > 0) {
    		this.precio = precio;
    	} else {
    	System.out.println ("Error el precio debe ser mayor a 0.");
    	}
    }
    // Validacion de stock
    public void setstock(int stock) {
    	if (stock >= 0) {
    		this.stock = stock;
    	} else {
    		System.out.println ("Error el stock no puede ser negativo.");
    		
    	}
    		
    }

// Metodo vender 
public void  vender(int cantidad ) {
	if (cantidad <= this.stock) {
		this.stock = this.stock - cantidad;
		System.out.println ("Venta realizada:"+ cantidad +" unidades");
	} else {
		System.out.println("Error:No hay suficiente stock para vender" + cantidad +" unidades.");
		
	}
}

// Muestra datos actauless
public void mostrar () {
	System.out.println("Producto: " + nombre +" | Precio: " + precio +"  |Stock: " + stock);
   }
// Se aplica para evitar la advertencia de que no se uso codigo
public String getCodigo() {
    return codigo;
}
}
	

    
    