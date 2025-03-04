/*
Sistema de Información de Empleados
Objetivo:
Desarrollar un programa en Java que modele empleados y gerentes en una organización, utilizando la herencia para extender la funcionalidad de la clase base Empleado en la clase derivada Gerente. Se debe demostrar cómo la subclase puede extender el método toString() heredado para incluir información adicional relevante.

Requisitos:

Clase Empleado (Superclase):

Atributos: nombre (String) y salario (double).
Constructor que inicialice los atributos nombre y salario.
Sobrescribir el método toString() para retornar una cadena de texto que incluya el nombre y el salario del empleado.

Clase Gerente (Subclase):

Hereda de la clase Empleado.
Añade un nuevo atributo: departamento (String).
Constructor que recibe los valores para nombre, salario y departamento, e inicializa los atributos correspondientes (pasando nombre y salario al constructor de la superclase).
Sobrescribir el método toString() para extender la cadena de texto heredada de Empleado, incluyendo la información del departamento del gerente.
Consideraciones:

Asegúrate de que el código esté bien organizado, sea legible y esté adecuadamente comentado.
Utiliza la sobrescritura de métodos de manera efectiva para extender y personalizar el comportamiento de la subclase.
 */
public class RelacionesEntreClases_Pregunta6 {
    public static void main(String[] args)
    {
        Empleado empleado = new Empleado("Juan Perez", 30000);
        System.out.println(empleado);  // Llama implícitamente a toString()

        Gerente gerente = new Gerente("Ana Gomez", 50000, "Sistemas");
        System.out.println(gerente);  // Llama implícitamente a toString(), mostrando también el departamento
    }
}

class Empleado{
    private String nombre;
    private double salario;

    Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Salario: " + salario;
    }
}

class Gerente extends Empleado{
    private String departamento;

    Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Salario: " + getSalario() + ", Departamento: " + departamento;
    }



}
