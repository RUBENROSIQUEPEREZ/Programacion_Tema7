/*
Sistema de Gestión de Estudiantes
Objetivo:
Desarrollar un programa en Java que modele personas y estudiantes en una institución educativa, utilizando la herencia para extender las funcionalidades de la clase Persona en la clase Estudiante. Se debe demostrar cómo la subclase Estudiante extiende todos los constructores de la superclase Persona, agregando un atributo adicional cicloFormativo.

Requisitos:

Clase Persona (Superclase):

Atributos: nombre (String) y edad (int).
Constructores:
Un constructor por defecto que inicialice nombre con el valor "Carmen Gaña" y edad con el valor 30.
Un constructor con parámetros para nombre y edad.
Un constructor de copia que cree una nueva instancia de Persona copiando los valores de otra instancia de Persona.
Método toString() que retorne una representación en cadena de la instancia, incluyendo el nombre y la edad.
Clase Estudiante (Subclase):

Hereda de la clase Persona.
Atributo adicional: cicloFormativo (String).
Constructores:
Un constructor por defecto que extiende el constructor por defecto de Persona e inicializa cicloFormativo con un valor por defecto.
Un constructor con parámetros para nombre, edad, y cicloFormativo, que extiende el constructor con parámetros de Persona.
Un constructor de copia que crea una nueva instancia de Estudiante copiando los valores de otra instancia de Estudiante, incluyendo cicloFormativo.
Método toString() sobrescrito que extiende la representación en cadena de Persona para incluir el cicloFormativo.
Consideraciones:

Asegúrate de que el código esté bien organizado y sea legible, incluyendo comentarios adecuados para explicar partes clave del programa.
Presta especial atención a la correcta implementación de los constructores en ambas clases para garantizar que los atributos de Persona y Estudiante se inicialicen correctamente.
 */
public class RelacionesEntreClases_Pregunta7 {
    public static void main(String[] args)
    {
        Estudiante estudiantePorDefecto = new Estudiante();
        Estudiante estudianteConParametros = new Estudiante("Ana", 20, "Desarrollo de Aplicaciones Web");
        Estudiante estudianteCopia = new Estudiante(estudianteConParametros);

        System.out.println(estudiantePorDefecto);
        System.out.println(estudianteConParametros);
        System.out.println(estudianteCopia);
    }
}
class Persona{
    //Atributos
    private String nombre;
    private int edad;

    //Constructor con parámetros
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Constructor por defecto
    Persona(){
        this.nombre = "Carmen Gaña";
        this.edad = 30;
    }
    //Constructor de copia
    Persona (Persona copia){
        this.nombre = copia.nombre;
        this.edad = copia.edad;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}
class Estudiante extends Persona{
    //Atributo adicional
    private String cicloFormativo;
    //Constructor con parametros
    Estudiante(String nombre, int edad, String cicloFormativo){
        super(nombre, edad);
        this.cicloFormativo = cicloFormativo;
    }
    //Constructor por defecto
    Estudiante(){
        super();
        this.cicloFormativo = "Desarrollo de Aplicaciones Multiplataforma";
    }
    //Constructor de copia
    Estudiante (Estudiante copia){
        super(copia.getNombre(), copia.getEdad());

        this.cicloFormativo = copia.cicloFormativo;
    }

    public String getCicloFormativo(){
        return cicloFormativo;
    }
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Ciclo Formativo: " + getCicloFormativo() ;
    }
}
