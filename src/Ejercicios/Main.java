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
          System.out.println("--\n");
          
          //Ejercicio 4:Curso y Calificaciones
          
          System.out.println("Resultado de notas"); 
          // Resultado aprobado 
          Curso curso1 = new Curso("Programacion orientada a objetos", 85, 75, 90);
          curso1.mostrarResultados();
          
          //Resultado reprobado
          Curso curso2 = new Curso("Matematica discreta", 30, 40, 50);
          curso2.mostrarResultados();
          System.out.println("--\n");
             
          //Ejercicio 5: Estudiante y Beca
          System.out.println("Consulta de becas");
          
          // Caso con beca
          Estudiante est1 = new Estudiante("2026-001", "Alexander Tema", 92.5);
          est1.mostrarInfo();
          
          // Caso sin beca
          Estudiante est2 = new Estudiante("2026-002", "Juan Perez", 70.0);
          est2.mostrarInfo();
          
          // Caso con promedio invalido
          Estudiante est3 = new Estudiante("2026-003", "Jorje Cifuentes", 110.0);
          est3.mostrarInfo();
          System.out.println("--\n");
          
       // Ejercicio 6:Termómetro Inteligente
          
          System.out.println("Pruebas de tmperatura");

          Termometro temp = new Termometro(25.0); // 25 grados ambiente
          
          System.out.println("Grados Celsius: " + temp.getCelsius() + "°C");
          System.out.println("Grados Fahrenheit: " + temp.getFahrenheit() + "°F");

          // Prueba de validación 
          
          System.out.println("\nIntentando poner una temperatura imposible (-300°C):");
          temp.setCelsius(-300.0);
          System.out.println("Temperatura final fijada: " + temp.getCelsius() + "°C");
          System.out.println("--\n");
          
        }
	
}

