/*
Sistema de Gestión de Biblioteca en Java
Objetivo: Desarrollar un pequeño sistema de gestión para una biblioteca utilizando Java, que demuestre el uso de la relación de composición entre clases.

Requisitos:

Clase Libro:

Atributos: título (String), autor (String).
Constructor con parámetros que inicialice los atributos.
Métodos de acceso (getters) para cada atributo.
toString()
Clase Biblioteca:

Atributo: una colección de libros (utilizar un vector).
Constructor que reciba un vector de objetos Libro y lo asigne a la colección de libros de la biblioteca.
Método que retorne la colección de libros.


Consideraciones:

La relación entre la clase Libro y Biblioteca debe ser de composición.
Asegúrate de que el código esté bien estructurado, comentado y siga las buenas prácticas de programación.


Se proporciona el código de la clase Main:
 */
public class RelacionesEntreClases_Pregunta1 {
    public static void main (String [] args){
        // Creando libros (Objetos de la clase Libro)
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("El señor de los anillos", "J.R.R. Tolkien");

        // Creando un vector para almacenar los libros
        Libro[] libros = new Libro[3];
        libros[0] = libro1;
        libros[1] = libro2;
        libros[2] = libro3;

        // Creando la biblioteca y asignándole libros
        Biblioteca biblioteca = new Biblioteca(libros);

        // Vector de libros en la biblioteca
        /*
        for(Libro libro : biblioteca.getLibros()): Este es un bucle for-each que itera sobre cada elemento del array devuelto por biblioteca.getLibros(). En cada iteración,
        el elemento actual se asigna a la variable libro de tipo Libro.
         */
        for(Libro libro : biblioteca.getLibros())
        {
            System.out.println(libro);
        }
    }
}
class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
/* No es necesario
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
*/
    @Override
    public String toString() {
        return "Libro{" +
                "titulo=" + titulo  +
                ", autor=" + autor  +
                "}";
    }
}
class Biblioteca {
    private Libro[] libros; // Composición

    public Biblioteca(Libro[] libros) { // Constructor que recibe un vector de libros
        this.libros = libros;
    }

    public Libro[] getLibros() {
        return libros;
    }
}
