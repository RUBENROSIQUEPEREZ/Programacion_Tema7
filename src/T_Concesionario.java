import java.util.Arrays;
import java.util.Objects;

public abstract class  T_Concesionario {
    String nombreConcesionario;
    String localizacionConcesionario;;
    T_VehiculoElectrificado [] coches;
    int indice;

    //Constructor con parametros
    public T_Concesionario(String nombreConcesionario, String localizacionConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
        this.localizacionConcesionario = localizacionConcesionario;
        this.coches = new T_VehiculoElectrificado[20];
        this.indice = 0;
    }
    //Constructor de copia
    public T_Concesionario(T_Concesionario copia){
        this.nombreConcesionario = copia.nombreConcesionario;
        this.localizacionConcesionario = copia.localizacionConcesionario;
        this.coches = copia.coches;
        this.indice = copia.indice;
    }
    //Constructor por defecto
    public T_Concesionario(){
        this.nombreConcesionario = "Concesionario Tesla";
        this.localizacionConcesionario = "Calle de la paz 1, Madrid";
        this.coches = new T_VehiculoElectrificado[20];
        this.indice = 0;
    }

    //getters
    public String getNombreConcesionario() {
        return nombreConcesionario;
    }
    public String getLocalizacionConcesionario() {
        return localizacionConcesionario;
    }

    //setters
    public void setNombreConcesionario(String nombreConcesionario) {
        this.nombreConcesionario = nombreConcesionario;
    }
    public void setLocalizacionConcesionario(String localizacionConcesionario) {
        this.localizacionConcesionario = localizacionConcesionario;
    }

    //metodos
    public void anadirCoche(T_VehiculoElectrificado coche) { //No me ha quedado muy claro
        if (indice < coches.length) {
            coches[indice] = coche;
            indice++;
        }
    }

    public int numCoches(){
        return indice;
    }

    @Override //Equals
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        T_Concesionario that = (T_Concesionario) o;
        return Objects.equals(nombreConcesionario, that.nombreConcesionario) && Objects.equals(localizacionConcesionario, that.localizacionConcesionario) && Objects.deepEquals(coches, that.coches);
    }

    @Override //hashcode
    public int hashCode() {
        return Objects.hash(nombreConcesionario, localizacionConcesionario, Arrays.hashCode(coches));
    }
    // toString
    @Override
    public String toString() {
        return "Concesionario{" +
                "nombre='" + nombreConcesionario + '\'' +
                ", localizacion='" + localizacionConcesionario + '\'' +
                ", coches=" + Arrays.toString(coches) +
                ", indice=" + indice +
                '}';
    }
}