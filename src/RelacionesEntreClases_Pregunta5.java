/*
A partir del ejercicio 1 de Herencia, redefine el método toString() en la clase Coche, para que ahora muestre que el tipo de objeto mostrado es un Coche y no un Vehiculo.

 */
public class RelacionesEntreClases_Pregunta5 {
    public static void main (String []args){
        // Crear una instancia de Coche
        Coches miCoche = new Coches("Toyota", "Corolla", 2020);

        // Utilizar los métodos heredados de la clase Vehículo
        System.out.println(miCoche);
        miCoche.arrancar();
        miCoche.detener();
    }
}
class Vehiculov2{
    // Atributos
    private String marca, modelo;
    private int anyo;

    // Constructor
    Vehiculov2(String marca, String modelo, int anyo){
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }

    public void arrancar(){
        System.out.println("El vehículo ha arrancado.");
    }

    public void detener(){
        System.out.println("El vehículo se ha detenido.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    @Override
    public String toString(){
        return "Vehiculo{" +
                "Marca: " + marca  +
                ", Modelo: " + modelo  +
                ", Año: " + anyo +
                "}";
    }
}
class Coches extends Vehiculov2{ // Subclase Coche hereda de la superclase Vehículo

    Coches (String marca, String modelo, int anyo){
        super(marca, modelo, anyo);
        /*
        Como no necesita agregar nuevos atributos, mediante super() se llama al constructor de la superclase Vehiculo para inicializar los atributos heredados
         */
    }

    @Override
    public String toString(){
        return "Coche{" +
                "Marca: " + getMarca() +
                ", Modelo: " + getModelo()  +
                ", Año: " + getAnyo() +
                "}";
    }
}

