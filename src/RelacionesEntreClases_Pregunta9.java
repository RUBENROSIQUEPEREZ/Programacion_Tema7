import java.util.Objects;

/*
OBJETIVO

Desarrollar un sistema en Java para gestionar productos en una tienda, incluyendo productos perecederos y no perecederos.
El sistema debe permitir manipular información relacionada con estos productos, como su nombre, precio, descripción, cantidad en stock, y fechas de caducidad o consumo preferente.

Requisitos:

Clase Abstracta Producto:
Atributos: nombre (String), precio (double), descripción (String), cantidadStock (int).
Métodos: getters y setters para cada atributo, toString(), equals(Object o), y hashCode().

Clase Perecedero (hereda de Producto):
Atributo adicional: fechaCaducidad (String).
Métodos: incluir manejo especializado para la fecha de caducidas(Object o)d y sobrescritura de los métodos
toString(), equal, y hashCode().
Clase NoPerecedero (hereda de Producto):

Atributo adicional: fechaConsumoPreferente (String).
Métodos: incluir manejo especializado para la fecha de consumo preferente y sobrescritura de los métodos toString(), equals(Object o), y hashCode().
 */
public class RelacionesEntreClases_Pregunta9 {
    public static void main (String []args){
        Producto p;

        Perecedero p1 = new Perecedero("Bebida de soja", 1.99, "Bebida de soja con calcio y sin gluten", 20, "18/04/2024");
        NoPerecedero np1 = new NoPerecedero("Quinoa", 12, "Quinoa de los Andes - 200grs", 20, "18/04/2027");

        p = p1;
        System.out.println(p);

        p = np1;
        System.out.println(np1);
    }
}
abstract class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidadStock;

    public Producto(String nombre, double precio, String descripcion, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(precio, producto.precio) == 0 && cantidadStock == producto.cantidadStock && Objects.equals(nombre, producto.nombre) && Objects.equals(descripcion, producto.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, descripcion, cantidadStock);
    }
}

class Perecedero extends Producto {
    private String fechaCaducidad;

    public Perecedero (String nombre, double precio, String descripcion, int cantidadStock, String fechaCaducidad) {
        super(nombre, precio, descripcion, cantidadStock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override

    public String toString() {
        return "Perecedero{" +
                "nombre='" + getNombre() +
                "', precio=" + getPrecio() +
                ", descripcion='" + getDescripcion()  +
                "', cantidadStock=" + getCantidadStock() +
                " ,fechaCaducidad='" + getFechaCaducidad()  +
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Perecedero that = (Perecedero) o;
        return Objects.equals(fechaCaducidad, that.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaCaducidad);
    }
}

class NoPerecedero extends Producto{
    private String fechaConsumoPreferente;

    public NoPerecedero (String nombre, double precio, String descripcion, int cantidadStock, String fechaConsumoPreferente) {
        super(nombre, precio, descripcion, cantidadStock);
        this.fechaConsumoPreferente = fechaConsumoPreferente;
    }

    public String getFechaConsumoPreferente() {
        return fechaConsumoPreferente;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "nombre='" + getNombre() +
                "', precio=" + getPrecio() +
                ", descripcion='" + getDescripcion()+
                "', cantidadStock=" + getCantidadStock() +
                " ,fechaConsumoPreferente='" + getFechaConsumoPreferente() +
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NoPerecedero that = (NoPerecedero) o;
        return Objects.equals(fechaConsumoPreferente, that.fechaConsumoPreferente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaConsumoPreferente);
    }
}
