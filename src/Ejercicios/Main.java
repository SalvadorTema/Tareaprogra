package Ejercicios;

public class Main {

	public static void main(String[] args) {
		
		//Ejercicio 1:Persona
		
		Persona p1 = new Persona("Alexander", "Tema", 19);
		p1.mostrar();
		p1.setEdad(-9);
		p1.mostrar ();
		 System.out.println("--\n");

		
        //Ejercicio 2:Producto con validaciones 
		
        // Creamos el producto (Código, Nombre, Precio, Stock)
        Producto prod1 = new Producto("P001", "Laptop Gaming", 1200.50, 5);
        
        System.out.println("Datos producto inicial");
        prod1.mostrar();
        
        System.out.println("Validaciones ");
        // Intentamos vender más de lo que hay (Debe dar error)
        prod1.vender(10); 
        
        // Intentamos poner un precio negativo (Debe dar error)
        prod1.setprecio(-50.0);
        
        // Venta correcta
        prod1.vender(2);
        
        System.out.println("Datos producto final");
        prod1.mostrar();
        System.out.println("--\n");

        //Ejercicio 3: Cuenta con pin
        
         CuentaBancaria miCuenta = new CuentaBancaria("Alexander Tema", 1000.0, 1234);

         System.out.println("Prueba de seguridad");
            
          // 1. Intento con PIN incorrecto
            miCuenta.retirar(100.0, 0000); 
            
          // 2. Intento con PIN correcto pero mucho dinero
            miCuenta.retirar(5000.0, 1234);
            
          // 3. Intento correcto
          miCuenta.retirar(250.0, 1234);

          miCuenta.mostrarSaldo();
        }
}

