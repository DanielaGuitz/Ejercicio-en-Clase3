package umg.ejercicio.vehiculos;

public class Coche extends Vehiculo {
    // Atributo adicional de la clase Cochie
    private int numeroDePuertas;

    // Constructor de la clase Coche
    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año); // Llama al constructor de la clase padre
        this.numeroDePuertas = numeroDePuertas;
    }

    //  número de puertas
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase padre
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
