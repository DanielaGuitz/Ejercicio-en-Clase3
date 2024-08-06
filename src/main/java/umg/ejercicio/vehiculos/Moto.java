package umg.ejercicio.vehiculos;

public class Moto extends Vehiculo{
    // Atributo adicional
    private boolean tieneSidecar;

    // Constructor de la clase Moto
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año); // Llama al constructor de la clase padre
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase padre
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}
