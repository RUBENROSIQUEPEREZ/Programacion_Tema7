/*
Sistema de Gestión de Vehículos en Java
Objetivo:
Desarrollar un programa en Java que modele un sistema de gestión de vehículos, utilizando la relación de herencia entre una superclase Vehiculo y una subclase Coche. La subclase deberá heredar y utilizar los métodos de la superclase sin añadir funcionalidades adicionales.

Requisitos:

Clase Vehiculo (Superclase):

Atributos: marca (String), modelo (String) y año (int).
Constructor que inicialice los atributos marca, modelo y año.
Método toString(): Devuelve en un String los detalles del vehículo (marca, modelo y año).
Método arrancar(): Imprime un mensaje indicando que el vehículo ha arrancado.
Método detener(): Imprime un mensaje indicando que el vehículo se ha detenido.
Clase Coche (Subclase):

Hereda de la clase Vehiculo.
Constructor que pasa los parámetros marca, modelo y año al constructor de la superclase Vehiculo.
La clase Coche no debe añadir nuevos métodos ni atributos. Su propósito es utilizar los métodos heredados de la clase Vehiculo.
Consideraciones:

Asegúrate de que el código esté correctamente organizado y sea fácil de leer, con comentarios adecuados donde sea necesario.
Presta especial atención a la relación de herencia para garantizar que la clase Coche utilice correctamente los métodos de la clase Vehiculo.

 */
public class RelacionesEntreClases_Pregunta4 {
    public static void main (String []args){
        // Crear una instancia de Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);

        // Utilizar los métodos heredados de la clase Vehículo
        System.out.println(miCoche);
        miCoche.arrancar();
        miCoche.detener();
    }
}
class Vehiculo{
    // Atributos
    private String marca, modelo;
    private int anyo;

    // Constructor
    Vehiculo(String marca, String modelo, int anyo){
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

    @Override
    public String toString(){
        return "Vehiculo{" +
                "Marca: " + marca  +
                ", Modelo: " + modelo  +
                ", Año: " + anyo +
                "}";
    }
}
class Coche extends Vehiculo{ // Subclase Coche hereda de la superclase Vehículo

    Coche (String marca, String modelo, int anyo){
        super(marca, modelo, anyo);
        /*
        Como no necesita agregar nuevos atributos, mediante super() se llama al constructor de la superclase Vehiculo para inicializar los atributos heredados
         */
    }
}
