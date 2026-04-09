package Ejercicios;

public class Reloj {
    // Atributos privados 
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Reloj(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    // Método Setter para Hora: Valida el rango de 0 a 23
    public void setHora(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        } else {
            System.out.println("Error: Hora inválida. Se asignó 0.");
            hora = 0;
        }
    }

    // Método Setter para Minuto: Valida el rango de 0 a 59
    public void setMinuto(int m) {
        if (m >= 0 && m <= 59) {
            minuto = m;
        } else {
            System.out.println("Error: Minuto inválido. Se asignó 0.");
            minuto = 0;
        }
    }

    // Método Setter para Segundo: Valida el rango de 0 a 59
    public void setSegundo(int s) {
        if (s >= 0 && s <= 59) {
            segundo = s;
        } else {
            System.out.println("Error: Segundo inválido. Se asignó 0.");
            segundo = 0;
        }
    }
    
//Retorna la hora como si fuese en un reloj 
    
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}