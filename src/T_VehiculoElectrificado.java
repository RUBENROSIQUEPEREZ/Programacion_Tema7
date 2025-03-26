import java.util.Objects;

public class T_VehiculoElectrificado {
    private String marca;
    private String modelo;
    private int anyo;
    private int idVehiculo;
    T_TipoEV tipoEV;

    //Contructor con parámetros
    public T_VehiculoElectrificado(String marca, String modelo, int anyo, int idVehiculo, T_TipoEV tipoEV) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.idVehiculo = idVehiculo;
        this.tipoEV = tipoEV;
    }

    //Contructor copia
    public T_VehiculoElectrificado(T_VehiculoElectrificado copia){
        this.marca = copia.marca;
        this.modelo = copia.modelo;
        this.anyo = copia.anyo;
        this.idVehiculo = copia.idVehiculo;
        this.tipoEV = copia.tipoEV;
    }

    //Contructor por defecto
    public T_VehiculoElectrificado(){
        this.marca = "Tesla";
        this.modelo = "Model 3";
        this.anyo = 2021;
        this.idVehiculo = 1;
        this.tipoEV = T_TipoEV.HEV;
    }

    //getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnyo() {
        return anyo;
    }
    public int getIdVehiculo() {
        return idVehiculo;
    }
    public T_TipoEV getTipoEV() {
        return tipoEV;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public void setTipoEV(T_TipoEV tipoEV) {
        this.tipoEV = tipoEV;
    }

    @Override //equals
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        T_VehiculoElectrificado that = (T_VehiculoElectrificado) o;
        return anyo == that.anyo && idVehiculo == that.idVehiculo &&
                Objects.equals(marca, that.marca) &&
                Objects.equals(modelo, that.modelo) &&
                tipoEV == that.tipoEV;
    }

    @Override //hascode
    public int hashCode() {
        return Objects.hash(marca, modelo, anyo, idVehiculo, tipoEV);
    }

    @Override //toString
    public String toString() {
        return "VehiculoElectrificado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anyo=" + anyo +
                ", idVehiculo=" + idVehiculo +
                ", tipoEV=" + tipoEV +
                '}';
    }
}