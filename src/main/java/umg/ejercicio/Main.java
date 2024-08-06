package umg.ejercicio;

import umg.ejercicio.vehiculos.Coche;
import umg.ejercicio.vehiculos.Moto;
import umg.ejercicio.vehiculos.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 2020, 4);
        Vehiculo moto = new Moto("Harley-Davidson", "Sportster", 2018, true);

        coche.mostrarDetalles();
        System.out.println();
        moto.mostrarDetalles();
        }
    }
