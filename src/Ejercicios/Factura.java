package Ejercicios;

public class Factura {
    //Atributos 
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public Factura(String codigo, String desc, int cant, double precio) {
        this.codigoFactura = codigo;
        this.descripcion = desc;
        
        // Validación: cantidad mayor a 0
        if (cant > 0) {
            this.cantidad = cant;
        } else {
            this.cantidad = 1; 
            System.out.println("Aviso: Cantidad inválida. Se ajustó a 1.");
        }

        // Validación: precio mayor a 0
        if (precio > 0) {
            this.precioUnitario = precio;
        } else {
            this.precioUnitario = 0.0;
            System.out.println("Aviso: Precio inválido. Se ajustó a 0.0.");
        }
    }

    // Método para calcular el total
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    // Método para mostrar todos los detalles
    public void mostrarFactura() {
        System.out.println("======= FACTURA: " + codigoFactura + " =======");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: Q" + precioUnitario);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL A PAGAR: Q" + String.format("%.2f", calcularTotal()));
      
    }
}