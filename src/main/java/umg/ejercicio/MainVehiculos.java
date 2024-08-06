package umg.ejercicio;

import conductores.ConductorDeCoche;
import conductores.ConductorDeMoto;

public class MainVehiculos {
    public static void main(String[] args) {
        // Instanciar objetos de ConductorDeCoche y ConductorDeMoto
        ConductorDeCoche conductorCoche = new ConductorDeCoche("Roberto", "C577448", 10);
        ConductorDeMoto conductorMoto = new ConductorDeMoto("Celeste", "M445757", true);

        // Mostrar información de los conductores
        System.out.println("Información del Conductor de Coche:");
        conductorCoche.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Conductor de Moto:");
        conductorMoto.mostrarInformacion();
    }
}
