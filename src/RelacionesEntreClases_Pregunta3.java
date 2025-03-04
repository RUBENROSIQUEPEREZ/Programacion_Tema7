/*
Modelando una Mano y sus Dedos en Java
Objetivo:
Desarrollar un programa en Java que modele una mano y sus dedos utilizando el concepto de composición, para demostrar la relación entre estos dos componentes, donde los dedos son partes inseparables de la mano.

Requisitos:

Clase Dedo:

Atributos: nombre (String) del dedo.
Constructor que inicialice el nombre del dedo.
Método para obtener el nombre del dedo.


Clase Mano:

Atributos: un arreglo de objetos Dedo.
Constructor que inicialice la mano con 5 dedos: Pulgar, Índice, Medio, Anular y Meñique.
Método para mostrar los nombres de todos los dedos.
Consideraciones:

La relación entre Mano y Dedo debe ser de composición, lo que implica que los dedos son parte integral de la mano y no tienen existencia independiente fuera de ella.
Asegúrate de que tu código esté bien estructurado y sea fácil de entender, con comentarios adecuados donde sea necesario.

 */
public class RelacionesEntreClases_Pregunta3 {
    public static void main (String [] args){
        Mano mano = new Mano();
        // Mostrar los dedos de la mano
        mano.mostrarDedos();
    }
}
class Dedo{
    // Atributos
    private String pulgar, indice, medio, anular, menique;

    // Constructor que inicializa los nombres de los dedos
    Dedo(){
        this.pulgar = "Pulgar";
        this.indice = "Índice";
        this.medio = "Medio";
        this.anular = "Anular";
        this.menique = "Meñique";
    }
    //Metodos
    public String getPulgar(){
        return pulgar;
    }
    public String getIndice(){
        return indice;
    }
    public String getMedio(){
        return medio;
    }
    public String getAnular(){
        return anular;
    }
    public String getMenique(){
        return menique;
    }
}

class Mano {
    // Atributos
    private Dedo[] dedos = new Dedo[5];

    // Constructor que inicializa la mano
    Mano (){
        dedos[0] = new Dedo();
        dedos[1] = new Dedo();
        dedos[2] = new Dedo();
        dedos[3] = new Dedo();
        dedos[4] = new Dedo();
    }

    public void  mostrarDedos(){
        System.out.println("Los dedos de la mano son:\n" +
                dedos[0].getPulgar() + "\n" +
                dedos[1].getIndice() + "\n" +
                dedos[2].getMedio() + "\n" +
                dedos[3].getAnular() + "\n" +
                dedos[4].getMenique());
    }
}