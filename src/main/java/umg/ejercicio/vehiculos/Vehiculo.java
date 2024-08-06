package umg.ejercicio.vehiculos;

public class Vehiculo {
//Atributos de Vehiculos
        private String marca;
        private String modelo;
        private int ano;
//Constructor
        public Vehiculo(String marca, String modelo, int ano){
                this.marca= marca;
                this.modelo = modelo;
                this.ano= ano;
        }
        //Metodod de Detalles
        public void mostrarDetalles(){
                System.out.println("Marca:"+marca);
                System.out.println("Modelo:"+modelo);
                System.out.println("Ano:"+ ano);
        }

        public String getMarca(String marca){
                return marca;
        }
        public String setMarca(String marca){
                return marca;
        }
        public String getModelo(String modelo){
                return modelo;
        }
        public String setModelo(String modelo){
                return modelo;
        }
        public int getAno() {
                return ano;

        }



}

