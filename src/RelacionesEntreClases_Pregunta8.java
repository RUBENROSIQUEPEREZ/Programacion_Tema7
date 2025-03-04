/*
Sistema de gestión para una cadena de tiendas de electrónica:
Imagina que eres parte de un equipo de desarrollo encargado de diseñar un sistema de gestión para una cadena de tiendas de electrónica.
Tu tarea es modelar el inventario de dispositivos electrónicos de la tienda, lo que incluye una variedad de artículos como tablets y laptops.
Estos dispositivos comparten algunas características comunes, como la capacidad de ser encendidos y apagados, pero también tienen sus propias funcionalidades específicas.

Para abordar este problema de manera eficiente, tu equipo ha decidido utilizar la programación orientada a objetos en Java, aprovechando conceptos como clases abstractas e
interfaces para crear una estructura de código reutilizable y escalable.

Enunciado del Problema:
Desarrolla un sistema en Java que modele dispositivos electrónicos en una tienda, utilizando una clase abstracta Gadget con propiedades comunes como marca y modelo, y métodos abstractos encender() y apagar().
Esta clase abstracta servirá como la superclase para diferentes tipos de dispositivos.

Implementa dos subclases de Gadget: Tablet y Laptop.

Ambas subclases deben sobrescribir los métodos encender() y apagar(), proporcionando implementaciones específicas para cada tipo de dispositivo.
Además, la clase Tablet, añadirá un atributo de tipo float llamado tamPantalla, y la clase Laptop, incorpora un atributo de tipo String llamado idiomaTeclado.
Tu implementación debe demostrar cómo se pueden crear instancias de Tablet y Laptop, y cómo estas instancias pueden utilizar tanto los métodos heredados de la clase abstracta Gadget.



Este sisetema debe ser fácilmente extensible, permitiendo la adición de nuevos tipos de dispositivos electrónicos en el futuro sin necesidad de modificar el código existente de manera significativa.
 */
public class RelacionesEntreClases_Pregunta8 {
    public static void main(String[] args) {
        Tablet t1 = new Tablet("iPad", "10", 10.9f);
        Laptop l1 = new Laptop("MacBook Pro", "M1", "Español");

        System.out.println(t1);
        System.out.println(l1);

        t1.encender();
        l1.encender();

        t1.apagar();
        l1.apagar();
    }
}
