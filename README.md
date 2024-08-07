
# Proyecto Herencia


Daniela Guitz  
0905-23-15374

## Parte 1 Vehículos
Este proyecto es una biblioteca de clases para diferentes tipos de vehículos, Esto con el objetivo de dejar clara la función de la herencia, implementandola en Java. Dicho proyecto fue distribuido en dos partes para poder trabajar en equipo eh ir rotándolo para que de esa forma integrar al propio la parte del otro.
Las clases incluidas son:

- **Vehiculo:** Clase base con los atributos `marca`, `modelo`, y `año`. Tiene el método `mostrarDetalles()` que imprime los detalles del vehículo.
- **Coche:** Hereda de `Vehiculo` y añade el atributo `numeroDePuertas`. Sobrescribe el método `mostrarDetalles()` para incluir el número de puertas.
- **Moto:** Hereda de `Vehiculo` y añade el atributo `tieneSidecar`. Sobrescribe el método `mostrarDetalles()` para incluir si tiene sidecar.

- ## Uso de la Librería del compañero
- He incluido y utilizado las clases ConductorDeCoche y ConductorDeMoto de la librería Conductores.jar proporcionada por mi compañero. A continuación se muestra un ejemplo de cómo se han utilizado:
# Estructura del Proyecto
```
Vehiculos/
│
├── src/
│   ├── Vehiculo.java
│   ├── Coche.java
│   └── Moto.java
│
├── lib/
│   └── Conductores.jar (proporcionado por mi compañero)
│
├── bin/ (compilación de clases)
│
├── Vehiculos.jar (archivo JAR generado)
│
└── README.md (este archivo)
```
